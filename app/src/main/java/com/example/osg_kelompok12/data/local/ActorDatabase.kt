package com.example.osg_kelompok12.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.osg_kelompok12.model.ResultsItem

@Database(entities = [ResultsItem::class], version = 1)
abstract class ActorDatabase : RoomDatabase() {

    abstract fun actorDao(): ActorDao

    companion object {
        private lateinit var INSTANCE: ActorDatabase
        private var slock = Object()

        fun getInstance(context: Context): ActorDatabase {
            synchronized(slock) {
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    ActorDatabase::class.java, "Actor.db")
                    .build()
                return INSTANCE
            }
        }
    }
}