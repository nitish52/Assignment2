package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext
import com.mindorks.bootcamp.learndagger.ui.HomeFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(var fragment: HomeFragment) {

    @Provides
    @ActivityContext
    fun provideContext(): Context {
        return fragment.activity!!.applicationContext
    }
}