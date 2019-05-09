package com.mindorks.bootcamp.learndagger.ui;

import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mindorks.bootcamp.learndagger.R;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent;
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;

import javax.inject.Inject;



/**
 * Created by admin on 5/9/2019.
 */

public class HomeFragment extends Fragment {

     @Inject
     HomeViewModel homeViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDependencies();
    }

    private void getDependencies() {
        DaggerFragmentComponent
                .builder()
                .applicationComponent(((MyApplication) getActivity().getApplication()).applicationComponent)
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        TextView tvData = getView().findViewById(R.id.tvData);

            tvData.setText(homeViewModel.getSomeData()+" Network Available:-"+homeViewModel.isNetworkAvailable());


    }
}
