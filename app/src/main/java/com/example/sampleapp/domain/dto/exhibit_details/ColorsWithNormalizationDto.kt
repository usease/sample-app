package com.example.sampleapp.domain.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class ColorsWithNormalizationDto(
    @SerializedName("normalizedHex")
    val normalizedHex: String,

    @SerializedName("originalHex")
    val originalHex: String
)