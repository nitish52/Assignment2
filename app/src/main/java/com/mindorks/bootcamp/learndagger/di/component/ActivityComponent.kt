package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import dagger.Component


@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}