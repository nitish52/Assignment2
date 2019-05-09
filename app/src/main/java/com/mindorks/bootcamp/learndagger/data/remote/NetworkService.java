package com.mindorks.bootcamp.learndagger.data.remote;

import android.content.Context;
import android.util.Log;

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
@Singleton
public class NetworkService {

    @Inject
    public NetworkService(@ApplicationContext Context context,
                          @NetworkInfo String apiKey) {
        // do the initialisation here

        Log.i("TAG", "NetworkService: inside constructor");
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
