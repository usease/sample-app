package com.example.sampleapp.network

import com.example.sampleapp.domain.util.DomainMapper
import retrofit2.Response

/**
 * Common class used by API responses.
 * @param <T> the type of the response object </T>
 * */
sealed class ApiResponse<T> {
    companion object {
        fun <T> create(error: Throwable): ApiErrorResponse<T> {
            return ApiErrorResponse(error.message ?: "Unknown error")
        }

        fun <T> create(response: Response<T>): ApiResponse<T> {
            return if (response.isSuccessful) {
                val body = response.body()
                if (body == null || response.code() == 204) {
                    ApiEmptyResponse()
                } else {
                    ApiSuccessResponse(body)
                }
            } else {
                val msg = response.errorBody()?.string()
                val errorMsg = if (msg.isNullOrEmpty()) {
                    response.message()
                } else {
                    msg
                }
                ApiErrorResponse(errorMsg ?: "Unknown error")
            }
        }

        /**
         * Creates [ApiResponse] from [Response].
         * Requires a [DomainMapper] that maps DTO to domain model.
         */
        fun <T, D> createByMapping(response: Response<T>, mapper: DomainMapper<T, D>): ApiResponse<D> {
            return if (response.isSuccessful) {
                val body = response.body()
                if (body == null || response.code() == 204) {
                    ApiEmptyResponse()
                } else {
                    val domainModel = mapper.mapToDomainModel(body)
                    ApiSuccessResponse(domainModel)
                }
            } else {
                val msg = response.errorBody()?.string()
                val errorMsg = if (msg.isNullOrEmpty()) {
                    response.message()
                } else {
                    msg
                }
                ApiErrorResponse(errorMsg ?: "Unknown error")
            }
        }
    }
}

/**
 * Separate class for HTTP 204 responses in order to make [ApiSuccessResponse]'s body non-null.
 */
class ApiEmptyResponse<T> : ApiResponse<T>()
data class ApiSuccessResponse<T>(val body: T) : ApiResponse<T>()
data class ApiErrorResponse<T>(val errorMessage: String) : ApiResponse<T>()