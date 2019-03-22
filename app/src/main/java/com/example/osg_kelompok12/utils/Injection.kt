package com.example.osg_kelompok12.utils

import android.content.Context
import com.example.osg_kelompok12.data.ActorRepository
import com.example.osg_kelompok12.data.local.ActorLocalDataSource
import com.example.osg_kelompok12.data.remote.ActorRemoteDataSource

abstract class Injection {
    companion object {
        fun providerActorRepository(context: Context): ActorRepository {
            return ActorRepository(ActorRemoteDataSource(), ActorLocalDataSource(context))
        }
    }
}