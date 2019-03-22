package com.example.osg_kelompok12.data

import com.example.osg_kelompok12.model.ResultsItem

interface ActorDataSource {
    fun getListPeople(callBack: GetPeopleCallBack)

    interface GetPeopleCallBack {
        fun onPeopleLoaded(data: List<ResultsItem>?)
        fun onDataNotAvailable(errorMessage: String?)
    }
}