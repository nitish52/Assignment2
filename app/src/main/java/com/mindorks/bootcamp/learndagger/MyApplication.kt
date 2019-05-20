package com.mindorks.bootcamp.learndagger

import android.app.Application
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.component.ApplicationComponent
import com.mindorks.bootcamp.learndagger.di.component.DaggerApplicationComponent
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import javax.inject.Inject



class MyApplication :Application() {

    lateinit var applicationComponent: ApplicationComponent

    @set:Inject
    internal var networkService: NetworkService? = null

    @set:Inject
    internal var databaseService: DatabaseService? = null

    /*@Inject
    internal var networkHelper: NetworkHelper? = null*/



    override fun onCreate() {
        super.onCreate()
        setup()
    }

    fun setup() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        applicationComponent.inject(this)
    }
}