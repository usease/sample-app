package com.example.sampleapp.domain.dto.exhibits

import com.google.gson.annotations.SerializedName

data class CountFacetsDto(
    @SerializedName("hasimage")
    val hasImage: Int,

    @SerializedName("ondisplay")
    val onDisplay: Int
)