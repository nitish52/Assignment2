package com.mindorks.bootcamp.learndagger.data.remote

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(@ApplicationContext context: Context, @DatabaseInfo apiKey:String){

    fun getDummyData():String{
        return "NETWORK_DUMMY_DATA"
    }
}