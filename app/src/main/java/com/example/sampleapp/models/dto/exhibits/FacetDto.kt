package com.example.sampleapp.models.dto.exhibits

import com.google.gson.annotations.SerializedName

data class FacetDto(
    @SerializedName("facets")
    val facetDtos: List<FacetObjectDto>,

    @SerializedName("name")
    val name: String,

    @SerializedName("otherTerms")
    val otherTerms: Int,

    @SerializedName("prettyName")
    val prettyName: Int
)