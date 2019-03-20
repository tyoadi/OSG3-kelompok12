package com.example.osg_kelompok12.data.remote

import com.example.osg_kelompok12.data.ActorDataSource
import com.example.osg_kelompok12.model.ApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActorRemoteDataSource : ActorDataSource {

    private val apiInterface = ApiClient.getClient()

    override fun getListPeople(callBack: ActorDataSource.GetPeopleCallBack) {
        val call = apiInterface.getPeople()
        call.enqueue(object : Callback<ApiResponse> {
            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                callBack.onDataNotAvailable(t.message)
            }

            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                when(response.code()) {
                    200 -> {
                        callBack.onPeopleLoaded(response.body()?.results)
                    }

                    else -> {
                        callBack.onDataNotAvailable(response.message())
                    }
                }
            }
        })
    }
}