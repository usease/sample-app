package com.example.sampleapp.network

import com.example.sampleapp.constants.Keys
import com.example.sampleapp.domain.dto.exhibits.ArtSearchResultDto
import com.example.sampleapp.domain.dto.exhibit_details.ExhibitDetailsDto
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryName

interface MuseumApi {
    @GET("collection")
    suspend fun getExhibits(
        @Query("p") pageNumber: Int = 0,
        @Query("imgonly") onlyWithImages: Boolean = true,
        @Query("key") key: String = Keys.API_KEY
    ): Response<com.example.sampleapp.domain.dto.exhibits.ArtSearchResultDto>

    @GET("collection/{objectNumber}/")
    suspend fun getExhibitDetails(
        @Path("objectNumber") objectNumber: String,
        @Query("key") key: String = Keys.API_KEY
    ): Response<com.example.sampleapp.domain.dto.exhibit_details.ExhibitDetailsDto>
}