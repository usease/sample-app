package com.example.sampleapp.domain.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class ExhibitDetailsDto(
    @SerializedName("artObject")
    val artObjectDto: com.example.sampleapp.domain.dto.exhibit_details.ArtObjectDto,

    @SerializedName("artObjectPage")
    val artObjectPageDto: com.example.sampleapp.domain.dto.exhibit_details.ArtObjectPageDto,

    @SerializedName("elapsedMilliseconds")
    val elapsedMilliseconds: Int
)