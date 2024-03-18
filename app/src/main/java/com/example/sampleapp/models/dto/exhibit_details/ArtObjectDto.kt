package com.example.sampleapp.models.dto.exhibit_details

import com.example.sampleapp.models.dto.exhibits.WebImageDto
import com.google.gson.annotations.SerializedName

data class ArtObjectDto(
    @SerializedName("acquisition")
    val acquisitionDto: AcquisitionDto,

    @SerializedName("artistRole")
    val artistRole: Any,

    @SerializedName("associations")
    val associations: List<Any>,

    @SerializedName("catRefRPK")
    val catRefRPK: List<Any>,

    @SerializedName("classification")
    val classificationDto: ClassificationDto,

    @SerializedName("colors")
    val colorDtos: List<ColorDto>,

    @SerializedName("colorsWithNormalization")
    val colorsWithNormalizationDto: List<ColorsWithNormalizationDto>,

    @SerializedName("copyrightHolder")
    val copyrightHolder: Any,

    @SerializedName("dating")
    val datingDto: DatingDto,

    @SerializedName("description")
    val description: String,

    @SerializedName("dimensions")
    val dimensionDtos: List<DimensionDto>,

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
    val labelDto: LabelDto,

    @SerializedName("labelText")
    val labelText: Any,

    @SerializedName("language")
    val language: String,

    @SerializedName("links")
    val detailLinksDto: DetailLinksDto,

    @SerializedName("location")
    val location: String,

    @SerializedName("longTitle")
    val longTitle: String,

    @SerializedName("makers")
    val makerDtos: List<MakerDto>,

    @SerializedName("materials")
    val materials: List<String>,

    @SerializedName("materialsThesaurus")
    val materialsThesaurus: List<Any>,

    @SerializedName("normalized32Colors")
    val normalized32ColorDtos: List<ColorDto>,

    @SerializedName("normalizedColors")
    val normalizedColorDtos: List<ColorDto>,

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
    val principalMakerDtos: List<MakerDto>,

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
    val webImage: WebImageDto
)