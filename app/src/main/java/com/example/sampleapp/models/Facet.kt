package com.example.sampleapp.models

import com.google.gson.annotations.SerializedName

data class Facet(
    @SerializedName("facets")
    val facets: List<FacetObject>,

    @SerializedName("name")
    val name: String,

    @SerializedName("otherTerms")
    val otherTerms: Int,

    @SerializedName("prettyName")
    val prettyName: Int
)