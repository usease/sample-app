package com.example.sampleapp.domain.exhibits

import com.example.sampleapp.domain.util.DomainMapper
import com.example.sampleapp.domain.dto.exhibits.ArtSearchResultDto

class ExhibitMapper : DomainMapper<com.example.sampleapp.domain.dto.exhibits.ArtSearchResultDto, List<Exhibit>> {
    override fun mapToDomainModel(dto: com.example.sampleapp.domain.dto.exhibits.ArtSearchResultDto): List<Exhibit> {
        return buildList {
            dto.artObjectDtos.forEach {
                add(
                    Exhibit(
                        objectNumber = it.objectNumber,
                        title = it.title,
                        principalOrFirstMaker = it.principalOrFirstMaker,
                        headerImageUrl = it.headerImageDto.url
                    )
                )
            }
        }
    }
}