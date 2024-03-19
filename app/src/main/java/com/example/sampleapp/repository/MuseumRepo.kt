package com.example.sampleapp.repository

import com.example.sampleapp.domain.exhibits.Exhibit
import com.example.sampleapp.domain.exhibit_details.ExhibitDetails
import com.example.sampleapp.network.ApiResponse

interface MuseumRepo {
    suspend fun getExhibits(pageNumber: Int): ApiResponse<List<Exhibit>>

    suspend fun getExhibitDetails(objectNumber: String): ApiResponse<ExhibitDetails>
}