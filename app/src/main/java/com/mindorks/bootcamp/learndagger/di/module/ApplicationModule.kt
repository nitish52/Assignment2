package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import android.content.Context
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private var application: MyApplication) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context {
        return application.applicationContext
    }


    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return "dummy_db"
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int {
        return 1
    }


    @Provides
    @NetworkInfo
    fun provideApiKey(): String {
        return "SOME_API_KEY"
    }
}