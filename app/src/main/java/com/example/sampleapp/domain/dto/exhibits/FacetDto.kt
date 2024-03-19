package com.example.sampleapp.domain.dto.exhibits

import com.google.gson.annotations.SerializedName

data class FacetDto(
    @SerializedName("facets")
    val facetDtos: List<com.example.sampleapp.domain.dto.exhibits.FacetObjectDto>,

    @SerializedName("name")
    val name: String,

    @SerializedName("otherTerms")
    val otherTerms: Int,

    @SerializedName("prettyName")
    val prettyName: Int
)