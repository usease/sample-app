package com.example.sampleapp.models

import com.google.gson.annotations.SerializedName

data class CountFacets(
    @SerializedName("hasimage")
    val hasImage: Int,

    @SerializedName("ondisplay")
    val onDisplay: Int
)