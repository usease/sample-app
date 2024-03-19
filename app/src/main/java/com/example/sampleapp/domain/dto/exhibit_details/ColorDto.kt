package com.example.sampleapp.domain.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class ColorDto(
    @SerializedName("hex")
    val hex: String,

    @SerializedName("percentage")
    val percentage: Int
)