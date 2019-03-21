package com.example.osg_kelompok12.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.osg_kelompok12.R
import com.example.osg_kelompok12.model.ResultsItem
import com.example.osg_kelompok12.navigator.ActorNavigator

class MainActivity : AppCompatActivity(), ActorNavigator {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun loadListActor(data: List<ResultsItem>) {

    }

    override fun errorLoadListActor(messages: String) {

    }
}
