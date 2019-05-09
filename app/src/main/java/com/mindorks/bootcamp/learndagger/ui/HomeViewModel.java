package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

/**
 * Created by admin on 5/9/2019.
 */
@FragmentScope
public class HomeViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;
    private NetworkHelper networkHelper;


    @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkService, NetworkHelper networkHelper) {
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }
   /* @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
        //  this.networkHelper = networkHelper;
    }*/


    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }

    public boolean isNetworkAvailable(){
        return  networkHelper.isNetworkConnected();
    }
}
