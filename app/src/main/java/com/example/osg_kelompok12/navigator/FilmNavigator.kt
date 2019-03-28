package com.example.osg_kelompok12.navigator

import com.example.osg_kelompok12.model.Film
import com.example.osg_kelompok12.model.ResultsItem

interface FilmNavigator {
    fun loadListFilm(film: Film?)
    fun errorLoadListActor(messages: String?)
}