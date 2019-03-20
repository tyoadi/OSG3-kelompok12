package com.example.osg_kelompok12.data.remote

import com.example.osg_kelompok12.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("people")
    fun getPeople(): Call<ApiResponse>
}