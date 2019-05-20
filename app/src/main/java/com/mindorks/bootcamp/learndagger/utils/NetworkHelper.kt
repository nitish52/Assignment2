package com.mindorks.bootcamp.learndagger.utils

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor(@ApplicationContext context: Context){

    fun isNetworkConnected():Boolean{
        return false
    }
}