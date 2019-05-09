package com.mindorks.bootcamp.learndagger.di.component;

import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.ui.HomeFragment;

import dagger.Component;

/**
 * Created by admin on 5/9/2019.
 */
@FragmentScope
@Component(dependencies = {ApplicationComponent.class},modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(HomeFragment homeFragment);
}
