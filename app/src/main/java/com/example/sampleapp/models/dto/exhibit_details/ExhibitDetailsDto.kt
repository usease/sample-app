package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class ExhibitDetailsDto(
    @SerializedName("artObject")
    val artObjectDto: ArtObjectDto,

    @SerializedName("artObjectPage")
    val artObjectPageDto: ArtObjectPageDto,

    @SerializedName("elapsedMilliseconds")
    val elapsedMilliseconds: Int
)