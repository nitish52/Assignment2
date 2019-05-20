package com.mindorks.bootcamp.learndagger.di.component

import android.content.Context
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext():Context

    fun getNetworkService():NetworkService

    fun getDatabaseService():DatabaseService

    fun getNetworkHelper():NetworkHelper

}