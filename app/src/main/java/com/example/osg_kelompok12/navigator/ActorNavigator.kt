package com.example.osg_kelompok12.navigator

import com.example.osg_kelompok12.model.ResultsItem

interface ActorNavigator {
    fun loadListActor(data: List<ResultsItem>)
    fun errorLoadListActor(messages: String)
}