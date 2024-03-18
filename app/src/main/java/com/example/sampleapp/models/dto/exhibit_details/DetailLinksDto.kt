package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class DetailLinksDto(
    @SerializedName("search")
    val search: String
)