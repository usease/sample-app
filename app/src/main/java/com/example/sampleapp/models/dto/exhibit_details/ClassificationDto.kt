package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class ClassificationDto(
    @SerializedName("events")
    val events: List<Any>,

    @SerializedName("iconClassDescription")
    val iconClassDescription: List<Any>,

    @SerializedName("iconClassIdentifier")
    val iconClassIdentifier: List<Any>,

    @SerializedName("motifs")
    val motifs: List<Any>,

    @SerializedName("objectNumbers")
    val objectNumbers: List<String>,

    @SerializedName("people")
    val people: List<String>,

    @SerializedName("periods")
    val periods: List<Any>,

    @SerializedName("places")
    val places: List<Any>
)