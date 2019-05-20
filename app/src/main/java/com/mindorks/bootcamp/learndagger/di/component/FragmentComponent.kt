package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope
import com.mindorks.bootcamp.learndagger.ui.HomeFragment
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import dagger.Component


@FragmentScope
@Component(dependencies = arrayOf(ApplicationComponent::class),modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(homeFragment: HomeFragment)

}