package com.example.osg_kelompok12.data.remote

import com.example.osg_kelompok12.model.ApiResponse
import com.example.osg_kelompok12.model.Film
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("people")
    fun getPeople(): Call<ApiResponse>


    @GET("{link}")
    fun getFilm(
        @Path("link") link: String?
    ): Call<Film>
}