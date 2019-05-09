package com.mindorks.bootcamp.learndagger.di.module;

import android.app.Fragment;
import android.content.Context;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.ui.HomeViewModel;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;


import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 5/9/2019.
 */

@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }
/*

   /* @Provides
    HomeViewModel provideHomeViewModel(DatabaseService databaseService, NetworkService networkService, NetworkHelper networkHelper) {
        return new HomeViewModel(databaseService,networkService,networkHelper);
    }*/

}
