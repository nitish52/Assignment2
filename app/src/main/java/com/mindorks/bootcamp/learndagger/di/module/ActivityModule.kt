package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: MainActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return activity.applicationContext
    }
}