package com.example.sampleapp.network

import com.example.sampleapp.constants.Constants
import com.example.sampleapp.constants.Keys
import com.example.sampleapp.models.ArtSearchResult
import retrofit2.http.GET
import retrofit2.http.Query

interface MuseumApi {
    @GET("collection")
    suspend fun getExhibits(
        @Query("key") key: String = Keys.API_KEY,
        @Query("culture") language: String = Constants.ENGLISH,
        @Query("imgonly") onlyWithImages: Boolean = true,
        ): ApiResponse<ArtSearchResult>
}