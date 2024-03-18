package com.example.sampleapp.models.dto.exhibit_details

import com.google.gson.annotations.SerializedName

data class MakerDto(
    @SerializedName("biography")
    val biography: Any,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String,

    @SerializedName("dateOfBirthPrecision")
    val dateOfBirthPrecision: Any,

    @SerializedName("dateOfDeath")
    val dateOfDeath: String,

    @SerializedName("dateOfDeathPrecision")
    val dateOfDeathPrecision: Any,

    @SerializedName("labelDesc")
    val labelDesc: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("nationality")
    val nationality: String,

    @SerializedName("occupation")
    val occupation: List<Any>,

    @SerializedName("placeOfBirth")
    val placeOfBirth: String,

    @SerializedName("placeOfDeath")
    val placeOfDeath: String,

    @SerializedName("productionPlaces")
    val productionPlaces: List<Any>,

    @SerializedName("qualification")
    val qualification: Any,

    @SerializedName("roles")
    val roles: List<Any>,

    @SerializedName("unFixedName")
    val unFixedName: String
)