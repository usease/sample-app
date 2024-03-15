package com.example.sampleapp.models

import com.google.gson.annotations.SerializedName

data class FacetObject(
    @SerializedName("key")
    val key: String,

    @SerializedName("value")
    val value: Int
)