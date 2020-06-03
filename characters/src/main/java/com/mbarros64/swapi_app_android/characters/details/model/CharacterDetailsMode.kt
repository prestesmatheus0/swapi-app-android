package com.mbarros64.swapi_app_android.characters.details.model

import com.google.gson.annotations.SerializedName
import com.mbarros64.swapi_app_android.dependencies.Exclude

typealias Specie = String
typealias SpecieLanguage = String

typealias Homeworld = String
typealias HomeworldPopulation = String

typealias Title = String
typealias ReleaseDate = String
typealias OpeningCrawl = String

data class CharacterDetailsModel(
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("birth_year") val birthYear: String?,
    @SerializedName("height") val heightCentimeters: String?,
    @Exclude val heightFt: Float?,

    @SerializedName("species") val species: List<String>?,
    @Exclude val specieDetails: Pair<Specie, SpecieLanguage>?,

    @Exclude val homeworldDetails: Pair<Homeworld, HomeworldPopulation>?,

    @SerializedName("films") val films: List<String>?,
    @Exclude val filmDetails: Triple<Title, ReleaseDate, OpeningCrawl>
)