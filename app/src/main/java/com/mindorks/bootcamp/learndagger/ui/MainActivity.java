package com.mindorks.bootcamp.learndagger.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent;
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDependencies();
        setContentView(R.layout.activity_main);
        addFrgament(new HomeFragment());


    }

    public void getDependencies() {
        DaggerActivityComponent
                .builder()
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);

    }

    private void addFrgament(Fragment fragment) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // ExampleFragment fragment = new ExampleFragment();
        fragmentTransaction.add(R.id.frame_container, fragment);

        //fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }
}
