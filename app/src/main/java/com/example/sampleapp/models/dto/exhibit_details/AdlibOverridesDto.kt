package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class AdlibOverridesDto(
    @SerializedName("etiketText")
    val etiketText: Any,

    @SerializedName("maker")
    val maker: Any,

    @SerializedName("titel")
    val titel: Any
)