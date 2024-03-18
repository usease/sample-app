package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class DimensionDto(
    @SerializedName("part")
    val part: Any,

    @SerializedName("precision")
    val precision: Any,

    @SerializedName("type")
    val type: String,

    @SerializedName("unit")
    val unit: String,

    @SerializedName("value")
    val value: String
)