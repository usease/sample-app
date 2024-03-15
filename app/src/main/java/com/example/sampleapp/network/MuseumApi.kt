package com.example.sampleapp.network

import androidx.lifecycle.LiveData
import com.example.myapplication.data.constants.Constants
import com.example.myapplication.data.constants.Keys
import com.example.sampleapp.models.ArtSearchResult
import retrofit2.http.GET
import retrofit2.http.Query

interface MuseumApi {
    @GET("collection")
    fun getExhibits(
        @Query("key") key: String = Keys.API_KEY,
        @Query("culture") language: String = Constants.ENGLISH,
        @Query("imgonly") onlyWithImages: Boolean = true,
        ): ArtSearchResult
}