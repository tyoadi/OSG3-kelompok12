package com.example.osg_kelompok12.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.osg_kelompok12.R
import com.example.osg_kelompok12.adapter.ActorAdapter
import com.example.osg_kelompok12.model.ResultsItem
import com.example.osg_kelompok12.navigator.ActorNavigator
import com.example.osg_kelompok12.utils.Injection
import com.example.osg_kelompok12.viewmodel.ActorViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ActorNavigator {
    private lateinit var actorViewModel: ActorViewModel
    private lateinit var actorAdapter: ActorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swipeRefresh.post {
            swipeRefresh.isRefreshing = true
            initAdapter()
        }

        swipeRefresh.setOnRefreshListener {
            swipeRefresh.isRefreshing = true
            initAdapter()
        }
    }

    override fun loadListActor(data: List<ResultsItem>) {
        swipeRefresh.isRefreshing = false

        Log.d("Sukses Online", data.size.toString())
        runOnUiThread {
            actorAdapter = ActorAdapter(this, data) {

            }
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = actorAdapter
        }
    }

    override fun errorLoadListActor(messages: String) {
        Log.d("Error", messages)
    }

    private fun initAdapter() {
        Log.d("Sukses", "Sukses")
        actorViewModel = ActorViewModel(Injection.providerActorRepository(this), this)
        actorViewModel.getListActor()
    }
}
