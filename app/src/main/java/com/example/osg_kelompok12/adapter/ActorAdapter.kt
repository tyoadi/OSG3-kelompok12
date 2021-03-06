package com.example.osg_kelompok12.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.osg_kelompok12.R
import com.example.osg_kelompok12.model.ResultsItem
import kotlinx.android.synthetic.main.layout_list_actor.view.*

class ActorAdapter(private val context: Context, private val list: List<ResultsItem>, private val listener: (ResultsItem) -> Unit)
    : RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) =
        ActorAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_list_actor, p0, false))

    override fun getItemCount() = list.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bind(list[p1], context, listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(resultsItem: ResultsItem, context: Context, listener: (ResultsItem) -> Unit) {
            itemView.tvName.text = resultsItem.name
            itemView.tvHeight.text = context.resources.getString(R.string.heigth, resultsItem.height)
            itemView.tvMass.text = context.resources.getString(R.string.mass, resultsItem.mass)

            itemView.setOnClickListener {
                listener(resultsItem)
            }
        }
    }
}