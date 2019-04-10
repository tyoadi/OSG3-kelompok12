package com.example.osg_kelompok12.data

import com.example.osg_kelompok12.model.Film

interface FilmDataSource {
    fun getListFilm(callBack: FilmDataSource.GetFilmCallBack, link: String?)

    interface GetFilmCallBack {
        fun onFilmLoaded(film: Film?)
        fun onDataNotAvailable(errorMessage: String?)
    }
}