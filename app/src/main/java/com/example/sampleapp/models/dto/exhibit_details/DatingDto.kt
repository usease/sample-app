package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class DatingDto(
    @SerializedName("period")
    val period: Int,

    @SerializedName("presentingDate")
    val presentingDate: String,

    @SerializedName("sortingDate")
    val sortingDate: Int,

    @SerializedName("yearEarly")
    val yearEarly: Int,

    @SerializedName("yearLate")
    val yearLate: Int
)