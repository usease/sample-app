package com.example.sampleapp.models.dto.exhibits

import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String,

    @SerializedName("web")
    val web: String
)