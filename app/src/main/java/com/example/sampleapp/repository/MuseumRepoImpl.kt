package com.example.sampleapp.repository

import com.example.sampleapp.models.ArtSearchResult
import com.example.sampleapp.network.ApiResponse
import com.example.sampleapp.network.MuseumApi

class MuseumRepoImpl(private val api: MuseumApi): MuseumRepo {
    override suspend fun getExhibits(): ApiResponse<ArtSearchResult> {
        val result = api.getExhibits()
        return ApiResponse.create(result)
    }
}