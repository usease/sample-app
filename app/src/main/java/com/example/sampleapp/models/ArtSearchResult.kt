package com.example.sampleapp.models

import com.google.gson.annotations.SerializedName

data class ArtSearchResult(
    @SerializedName("artObjects")
    val artObjects: List<ArtObject>,

    @SerializedName("count")
    val count: Int,

    @SerializedName("countFacets")
    val countFacets: CountFacets,

    @SerializedName("elapsedMilliseconds")
    val elapsedMilliseconds: Int,

    @SerializedName("facets")
    val facets: List<Facet>
)