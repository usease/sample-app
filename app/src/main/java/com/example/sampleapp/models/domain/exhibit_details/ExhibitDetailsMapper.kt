package com.example.sampleapp.models.domain.exhibit_details

import com.example.sampleapp.models.domain.util.DomainMapper
import com.example.sampleapp.models.dto.exhibit_details.ExhibitDetailsDto

class ExhibitDetailsMapper : DomainMapper<ExhibitDetailsDto, ExhibitDetails> {
    override fun mapToDomainModel(dto: ExhibitDetailsDto): ExhibitDetails {
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