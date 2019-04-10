package com.example.osg_kelompok12.data.remote

import com.example.osg_kelompok12.data.FilmDataSource
import com.example.osg_kelompok12.model.Film
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FilmRemoteDataSource : FilmDataSource {

    private val apiInterface = ApiClient.getClient()

    override fun getListFilm(callBack: FilmDataSource.GetFilmCallBack, link: String?) {
        val call = apiInterface.getFilm(link)
        call.enqueue(object : Callback<Film> {
            override fun onFailure(call: Call<Film>, t: Throwable) {
                callBack.onDataNotAvailable(t.message)
            }

            override fun onResponse(call: Call<Film>, response: Response<Film>) {
                when(response.code()) {
                    200 -> {
                        callBack.onFilmLoaded(response.body())
                    }

                    else -> {
                        callBack.onDataNotAvailable(response.message())
                    }
                }
            }

        })
    }
}