package com.example.sampleapp.models.dto.exhibits

import com.google.gson.annotations.SerializedName

data class CountFacetsDto(
    @SerializedName("hasimage")
    val hasImage: Int,

    @SerializedName("ondisplay")
    val onDisplay: Int
)