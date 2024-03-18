package com.example.sampleapp.models.dto.exhibits

import com.google.gson.annotations.SerializedName

data class ArtSearchResultDto(
    @SerializedName("artObjects")
    val artObjectDtos: List<ArtObjectDto>,

    @SerializedName("count")
    val count: Int,

    @SerializedName("countFacets")
    val countFacetsDto: CountFacetsDto,

    @SerializedName("elapsedMilliseconds")
    val elapsedMilliseconds: Int,

    @SerializedName("facets")
    val facetDtos: List<FacetDto>
)