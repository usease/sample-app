package com.example.sampleapp.repository

import com.example.sampleapp.domain.exhibits.Exhibit
import com.example.sampleapp.domain.exhibit_details.ExhibitDetails
import com.example.sampleapp.domain.exhibit_details.ExhibitDetailsMapper
import com.example.sampleapp.domain.exhibits.ExhibitMapper
import com.example.sampleapp.network.ApiResponse
import com.example.sampleapp.network.MuseumApi

class MuseumRepoImpl(private val api: MuseumApi,
                     private val exhibitMapper: ExhibitMapper,
                     private val exhibitDetailsMapper: ExhibitDetailsMapper
): MuseumRepo {
    override suspend fun getExhibits(pageNumber: Int): ApiResponse<List<Exhibit>> {
        val exhibitsDto = api.getExhibits(pageNumber = pageNumber)
        return ApiResponse.createByMapping(exhibitsDto, exhibitMapper)
    }

    override suspend fun getExhibitDetails(objectNumber: String): ApiResponse<ExhibitDetails> {
        val exhibitDetailsDto = api.getExhibitDetails(objectNumber)
        return ApiResponse.createByMapping(exhibitDetailsDto, exhibitDetailsMapper)
    }
}