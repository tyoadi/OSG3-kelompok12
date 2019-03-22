package com.example.osg_kelompok12.data.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.osg_kelompok12.model.ResultsItem

@Dao
interface ActorDao {
    @Query("SELECT * FROM actor")
    fun getActor(): List<ResultsItem>

    @Insert
    fun insertActor(actorLocalItem: List<ResultsItem>)
}