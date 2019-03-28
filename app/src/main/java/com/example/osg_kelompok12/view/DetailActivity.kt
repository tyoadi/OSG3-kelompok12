package com.example.osg_kelompok12.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.osg_kelompok12.R
import com.example.osg_kelompok12.model.Film
import com.example.osg_kelompok12.model.ResultsItem
import com.example.osg_kelompok12.navigator.FilmNavigator
import com.example.osg_kelompok12.utils.Injection
import com.example.osg_kelompok12.viewmodel.FilmViewModel

class DetailActivity : AppCompatActivity(), FilmNavigator {
    private lateinit var filmViewModel: FilmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val resultsItem = intent.getParcelableExtra<ResultsItem>("result_item")

        resultsItem.films?.let {
            val remove = "https://swapi.co/api/"
            val split = it[1].split(remove)
            initAdapter(split[1])
        }
    }

    override fun loadListFilm(film: Film?) {
        film?.let {
            Toast.makeText(this, it.director, Toast.LENGTH_LONG).show()
        }
    }

    override fun errorLoadListActor(messages: String?) {
        Toast.makeText(this, messages, Toast.LENGTH_LONG).show()
    }

    private fun initAdapter(link: String?) {
        Log.d("Sukses", "Sukses")
        filmViewModel = FilmViewModel(Injection.providerFilmRepository(), this)
        filmViewModel.getListFilm(link)
    }
}
