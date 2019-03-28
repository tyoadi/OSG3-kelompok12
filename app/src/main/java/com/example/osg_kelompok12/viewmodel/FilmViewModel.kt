package com.example.osg_kelompok12.viewmodel

import com.example.osg_kelompok12.data.FilmDataSource
import com.example.osg_kelompok12.data.FilmRepository
import com.example.osg_kelompok12.model.Film
import com.example.osg_kelompok12.navigator.FilmNavigator

class FilmViewModel(private val actorRepository: FilmRepository, val mNavigator: FilmNavigator) {
    fun getListFilm(link: String?) {
        actorRepository.getListFilm(object : FilmDataSource.GetFilmCallBack {
            override fun onFilmLoaded(film: Film?) {
                mNavigator.loadListFilm(film)
            }

            override fun onDataNotAvailable(errorMessage: String?) {
                mNavigator.errorLoadListActor(errorMessage)
            }

        }, link)
    }
}