package com.example.sampleapp.domain.dto.exhibit_details

import com.example.sampleapp.domain.dto.exhibits.WebImageDto
import com.google.gson.annotations.SerializedName

data class ArtObjectDto(
    @SerializedName("acquisition")
    val acquisitionDto: com.example.sampleapp.domain.dto.exhibit_details.AcquisitionDto,

    @SerializedName("artistRole")
    val artistRole: Any,

    @SerializedName("associations")
    val associations: List<Any>,

    @SerializedName("catRefRPK")
    val catRefRPK: List<Any>,

    @SerializedName("classification")
    val classificationDto: com.example.sampleapp.domain.dto.exhibit_details.ClassificationDto,

    @SerializedName("colors")
    val colorDtos: List<com.example.sampleapp.domain.dto.exhibit_details.ColorDto>,

    @SerializedName("colorsWithNormalization")
    val colorsWithNormalizationDto: List<com.example.sampleapp.domain.dto.exhibit_details.ColorsWithNormalizationDto>,

    @SerializedName("copyrightHolder")
    val copyrightHolder: Any,

    @SerializedName("dating")
    val datingDto: com.example.sampleapp.domain.dto.exhibit_details.DatingDto,

    @SerializedName("description")
    val description: String,

    @SerializedName("dimensions")
    val dimensionDtos: List<com.example.sampleapp.domain.dto.exhibit_details.DimensionDto>,

    @SerializedName("documentation")
    val documentation: List<String>,

    @SerializedName("exhibitions")
    val exhibitions: List<Any>,

    @SerializedName("hasImage")
    val hasImage: Boolean,

    @SerializedName("historicalPersons")
    val historicalPersons: List<String>,

    @SerializedName("id")
    val id: String,

    @SerializedName("inscriptions")
    val inscriptions: List<Any>,

    @SerializedName("label")
    val labelDto: com.example.sampleapp.domain.dto.exhibit_details.LabelDto,

    @SerializedName("labelText")
    val labelText: Any,

    @SerializedName("language")
    val language: String,

    @SerializedName("links")
    val detailLinksDto: com.example.sampleapp.domain.dto.exhibit_details.DetailLinksDto,

    @SerializedName("location")
    val location: String,

    @SerializedName("longTitle")
    val longTitle: String,

    @SerializedName("makers")
    val makerDtos: List<com.example.sampleapp.domain.dto.exhibit_details.MakerDto>,

    @SerializedName("materials")
    val materials: List<String>,

    @SerializedName("materialsThesaurus")
    val materialsThesaurus: List<Any>,

    @SerializedName("normalized32Colors")
    val normalized32ColorDtos: List<com.example.sampleapp.domain.dto.exhibit_details.ColorDto>,

    @SerializedName("normalizedColors")
    val normalizedColorDtos: List<com.example.sampleapp.domain.dto.exhibit_details.ColorDto>,

    @SerializedName("objectCollection")
    val objectCollection: List<String>,

    @SerializedName("objectNumber")
    val objectNumber: String,

    @SerializedName("objectTypes")
    val objectTypes: List<Any>,

    @SerializedName("physicalMedium")
    val physicalMedium: String,

    @SerializedName("physicalProperties")
    val physicalProperties: List<Any>,

    @SerializedName("plaqueDescriptionDutch")
    val plaqueDescriptionDutch: String,

    @SerializedName("plaqueDescriptionEnglish")
    val plaqueDescriptionEnglish: String,

    @SerializedName("principalMaker")
    val principalMaker: String,

    @SerializedName("principalMakers")
    val principalMakerDtos: List<com.example.sampleapp.domain.dto.exhibit_details.MakerDto>,

    @SerializedName("principalOrFirstMaker")
    val principalOrFirstMaker: String,

    @SerializedName("priref")
    val priref: String,

    @SerializedName("productionPlaces")
    val productionPlaces: List<Any>,

    @SerializedName("productionPlacesThesaurus")
    val productionPlacesThesaurus: List<Any>,

    @SerializedName("scLabelLine")
    val scLabelLine: String,

    @SerializedName("showImage")
    val showImage: Boolean,

    @SerializedName("subTitle")
    val subTitle: String,

    @SerializedName("techniques")
    val techniques: List<String>,

    @SerializedName("techniquesThesaurus")
    val techniquesThesaurus: List<Any>,

    @SerializedName("title")
    val title: String,

    @SerializedName("titles")
    val titles: List<String>,

    @SerializedName("webImage")
    val webImage: com.example.sampleapp.domain.dto.exhibits.WebImageDto
)