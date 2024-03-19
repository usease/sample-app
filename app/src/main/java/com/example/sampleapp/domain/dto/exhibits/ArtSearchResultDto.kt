package com.example.sampleapp.domain.dto.exhibits

import com.google.gson.annotations.SerializedName

data class ArtSearchResultDto(
    @SerializedName("artObjects")
    val artObjectDtos: List<com.example.sampleapp.domain.dto.exhibits.ArtObjectDto>,

    @SerializedName("count")
    val count: Int,

    @SerializedName("countFacets")
    val countFacetsDto: com.example.sampleapp.domain.dto.exhibits.CountFacetsDto,

    @SerializedName("elapsedMilliseconds")
    val elapsedMilliseconds: Int,

    @SerializedName("facets")
    val facetDtos: List<com.example.sampleapp.domain.dto.exhibits.FacetDto>
)