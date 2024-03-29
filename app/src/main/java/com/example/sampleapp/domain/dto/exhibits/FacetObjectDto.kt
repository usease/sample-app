package com.example.sampleapp.domain.dto.exhibits

import com.google.gson.annotations.SerializedName

data class FacetObjectDto(
    @SerializedName("key")
    val key: String,

    @SerializedName("value")
    val value: Int
)