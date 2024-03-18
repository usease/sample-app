package com.example.sampleapp.repository

import com.example.sampleapp.models.domain.exhibits.Exhibit
import com.example.sampleapp.models.domain.exhibit_details.ExhibitDetails
import com.example.sampleapp.models.domain.exhibit_details.ExhibitDetailsMapper
import com.example.sampleapp.models.domain.exhibits.ExhibitMapper
import com.example.sampleapp.network.ApiResponse
import com.example.sampleapp.network.MuseumApi

class MuseumRepoImpl(private val api: MuseumApi,
                     private val exhibitMapper: ExhibitMapper,
                     private val exhibitDetailsMapper: ExhibitDetailsMapper
): MuseumRepo {
    override suspend fun getExhibits(): ApiResponse<List<Exhibit>> {
        val exhibitsDto = api.getExhibits()
        return ApiResponse.createByMapping(exhibitsDto, exhibitMapper)
    }

    override suspend fun getExhibitDetails(objectNumber: String): ApiResponse<ExhibitDetails> {
        val exhibitDetailsDto = api.getExhibitDetails(objectNumber)
        return ApiResponse.createByMapping(exhibitDetailsDto, exhibitDetailsMapper)
    }
}