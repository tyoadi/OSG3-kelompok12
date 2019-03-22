package com.example.osg_kelompok12.data.local

import android.content.Context
import com.example.osg_kelompok12.data.ActorDataSource
import com.example.osg_kelompok12.model.ApiResponse
import com.example.osg_kelompok12.model.ResultsItem

class ActorLocalDataSource(private val context: Context, private val actorDao: ActorDao) : ActorDataSource {

    override fun getListPeople(callBack: ActorDataSource.GetPeopleCallBack) {
        val runnable = Runnable {
            val actor = actorDao.getActor()
            if (actor.isEmpty()) {
                callBack.onDataNotAvailable("Data di Database SQLite kosong")
            } else {
               ApiResponse().results.let {
                   callBack.onPeopleLoaded(it)
               }
            }
        }
        Thread(runnable).start()
    }

    fun saveDataActor(actor: List<ResultsItem>) {
        val runnable = Runnable {
            actorDao.insertActor(actor)
        }
        Thread(runnable).start()
    }
}