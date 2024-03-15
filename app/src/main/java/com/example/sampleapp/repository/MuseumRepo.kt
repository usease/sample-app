package com.example.sampleapp.repository

import com.example.sampleapp.models.ArtSearchResult
import com.example.sampleapp.network.ApiResponse

interface MuseumRepo {
    suspend fun getExhibits(): ApiResponse<ArtSearchResult>
}