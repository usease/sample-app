package com.example.sampleapp.models.domain.exhibits

import com.example.sampleapp.models.domain.util.DomainMapper
import com.example.sampleapp.models.dto.exhibits.ArtSearchResultDto

class ExhibitMapper : DomainMapper<ArtSearchResultDto, List<Exhibit>> {
    override fun mapToDomainModel(dto: ArtSearchResultDto): List<Exhibit> {
        return buildList {
            dto.artObjectDtos.forEach {
                add(
                    Exhibit(
                        it.title
                    )
                )
            }
        }
    }
}