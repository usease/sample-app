package com.example.sampleapp.domain.dto.exhibits

import com.google.gson.annotations.SerializedName

data class ArtObjectDto(
    @SerializedName("hasImage")
    val hasImage: Boolean,

    @SerializedName("headerImage")
    val headerImageDto: com.example.sampleapp.domain.dto.exhibits.HeaderImageDto,

    @SerializedName("id")
    val id: String,

    @SerializedName("links")
    val linksDto: com.example.sampleapp.domain.dto.exhibits.LinksDto,

    @SerializedName("longTitle")
    val longTitle: String,

    @SerializedName("objectNumber")
    val objectNumber: String,

    @SerializedName("permitDownload")
    val permitDownload: Boolean,

    @SerializedName("principalOrFirstMaker")
    val principalOrFirstMaker: String,

    @SerializedName("productionPlaces")
    val productionPlaces: List<Any>,

    @SerializedName("showImage")
    val showImage: Boolean,

    @SerializedName("title")
    val title: String,

    @SerializedName("webImage")
    val webImageDto: com.example.sampleapp.domain.dto.exhibits.WebImageDto
)