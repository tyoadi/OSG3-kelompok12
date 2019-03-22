package com.example.osg_kelompok12.data

import android.util.Log
import com.example.osg_kelompok12.data.local.ActorLocalDataSource
import com.example.osg_kelompok12.data.remote.ActorRemoteDataSource
import com.example.osg_kelompok12.model.ResultsItem

class ActorRepository(private val actorRemoteDataSource: ActorRemoteDataSource, private val actorLocalDataSource: ActorLocalDataSource) : ActorDataSource {
    override fun getListPeople(callBack: ActorDataSource.GetPeopleCallBack) {
        actorLocalDataSource.getListPeople(object : ActorDataSource.GetPeopleCallBack {
            override fun onPeopleLoaded(data: List<ResultsItem>?) {
                Log.d("Error Local 2", data?.size.toString())
                callBack.onPeopleLoaded(data)
            }

            override fun onDataNotAvailable(errorMessage: String?) {
                Log.d("Error", errorMessage)
                getActorFromRemoteDataSource(callBack)
            }

        })
    }

    private fun getActorFromRemoteDataSource(callBack: ActorDataSource.GetPeopleCallBack) {
        actorRemoteDataSource.getListPeople(object : ActorDataSource.GetPeopleCallBack {
            override fun onPeopleLoaded(data: List<ResultsItem>?) {
                data?.let {
                    actorLocalDataSource.saveDataActor(it)
                }
                callBack.onPeopleLoaded(data)
            }

            override fun onDataNotAvailable(errorMessage: String?) {
                callBack.onDataNotAvailable(errorMessage)
            }

        })
    }
}