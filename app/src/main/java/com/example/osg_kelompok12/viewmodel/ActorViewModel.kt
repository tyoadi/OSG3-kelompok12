package com.example.osg_kelompok12.viewmodel

import android.content.Context
import com.example.osg_kelompok12.data.ActorDataSource
import com.example.osg_kelompok12.data.ActorRepository
import com.example.osg_kelompok12.model.ResultsItem
import com.example.osg_kelompok12.navigator.ActorNavigator

class ActorViewModel(private val actorRepository: ActorRepository, val context: Context, val mNavigator: ActorNavigator) {

    private fun getListActor() {
        actorRepository.getListPeople(object : ActorDataSource.GetPeopleCallBack{
            override fun onPeopleLoaded(data: List<ResultsItem>?) {
                data?.let { mNavigator.loadListActor(it) }

            }

            override fun onDataNotAvailable(errorMessage: String?) {
                errorMessage?.let { mNavigator.errorLoadListActor(it) }
            }
        })

    }
}