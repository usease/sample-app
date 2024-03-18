package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class LabelDto(
    @SerializedName("date")
    val date: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("makerLine")
    val makerLine: String,

    @SerializedName("notes")
    val notes: String,

    @SerializedName("title")
    val title: String
)