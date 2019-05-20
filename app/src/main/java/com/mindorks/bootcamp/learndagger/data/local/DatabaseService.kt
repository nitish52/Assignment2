package com.mindorks.bootcamp.learndagger.data.local

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class  DatabaseService @Inject constructor(@ApplicationContext context: Context,@DatabaseInfo databaseName:String,@DatabaseInfo databaseVersion:String){

    fun getDummyData():String{
        return "DATABASE_DUMMY_DATA"
    }
}