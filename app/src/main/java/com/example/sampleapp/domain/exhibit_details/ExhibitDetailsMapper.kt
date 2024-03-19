package com.example.sampleapp.domain.exhibit_details

import com.example.sampleapp.domain.util.DomainMapper
import com.example.sampleapp.domain.dto.exhibit_details.ExhibitDetailsDto

class ExhibitDetailsMapper : DomainMapper<com.example.sampleapp.domain.dto.exhibit_details.ExhibitDetailsDto, ExhibitDetails> {
    override fun mapToDomainModel(dto: com.example.sampleapp.domain.dto.exhibit_details.ExhibitDetailsDto): ExhibitDetails {
        return ExhibitDetails(
            title = dto.artObjectDto.labelDto.title,
            imageUrl = dto.artObjectDto.webImage.url,
            objectNumber = dto.artObjectDto.objectNumber,
            makerLine = dto.artObjectDto.labelDto.makerLine,
            desc = dto.artObjectDto.labelDto.description,
            materials = dto.artObjectDto.materials,
            techniques = dto.artObjectDto.techniques,
        )
    }
}