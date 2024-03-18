package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class AcquisitionDto(
    @SerializedName("creditLine")
    val creditLine: String,

    @SerializedName("date")
    val date: String,

    @SerializedName("method")
    val method: String
)