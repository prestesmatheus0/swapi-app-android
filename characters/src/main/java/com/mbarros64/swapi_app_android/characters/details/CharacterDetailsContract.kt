package com.mbarros64.swapi_app_android.characters.details

import com.mbarros64.swapi_app_android.characters.details.models.CharacterDetailsModel
import com.mbarros64.swapi_app_android.characters.details.models.response.FilmResponseModel
import com.mbarros64.swapi_app_android.characters.details.models.response.HomeworldResponseModel
import com.mbarros64.swapi_app_android.characters.details.models.response.SpeciesResponseModel
import io.reactivex.Single


interface CharacterDetailsContract {
    interface Repo {
        fun getCharacterDetails(url: String): Single<CharacterDetailsModel>
        fun getSpecieDetails(url: String?): Single<SpeciesResponseModel>
        fun getFilmDetails(url: String?): Single<FilmResponseModel>
        fun getHomeworldDetails(url: String?): Single<HomeworldResponseModel?>
    }
}