package com.example.osg_kelompok12.data

import com.example.osg_kelompok12.data.remote.FilmRemoteDataSource
import com.example.osg_kelompok12.model.Film

class FilmRepository(private val filmRemoteDataSource: FilmRemoteDataSource) : FilmDataSource {
    override fun getListFilm(callBack: FilmDataSource.GetFilmCallBack, link: String?) {
        filmRemoteDataSource.getListFilm(object : FilmDataSource.GetFilmCallBack {
            override fun onFilmLoaded(film: Film?) {
                callBack.onFilmLoaded(film)
            }

            override fun onDataNotAvailable(errorMessage: String?) {
                callBack.onDataNotAvailable(errorMessage)
            }

        }, link)
    }
}