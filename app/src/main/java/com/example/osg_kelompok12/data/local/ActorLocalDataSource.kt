package com.example.osg_kelompok12.data.local

import android.content.Context
import com.example.osg_kelompok12.data.ActorDataSource
import com.example.osg_kelompok12.model.ResultsItem

class ActorLocalDataSource(private val context: Context) : ActorDataSource {
    override fun getListPeople(callBack: ActorDataSource.GetPeopleCallBack) {
        val runnable = Runnable {
            val actorDao = ActorDatabase.getInstance(context).actorDao()
            val actor = actorDao.getActor()
            if (actor.isEmpty()) {
                callBack.onDataNotAvailable("Data di Database SQLite kosong")
            } else {
                callBack.onPeopleLoaded(actor)
            }
        }
        Thread(runnable).start()
    }

    fun saveDataActor(actor: List<ResultsItem>) {
        val runnable = Runnable {
            val actorDao = ActorDatabase.getInstance(context).actorDao()
            actorDao.insertActor(actor)
        }
        Thread(runnable).start()
    }
}