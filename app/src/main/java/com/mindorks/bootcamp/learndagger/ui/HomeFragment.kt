package com.mindorks.bootcamp.learndagger.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule
import javax.inject.Inject

class HomeFragment: Fragment(){


    @set:Inject
     internal var  homeViewModel: HomeViewModel? = null

    val TAG = "HomeFragment"

    fun newInstance():Fragment{
        return HomeFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
    }

    private fun getDependencies() {
        val aboutComponent = DaggerFragmentComponent.builder()
              //  .applicationComponent((application as MyApplication).applicationComponent)
                .applicationComponent((context!!.applicationContext as MyApplication).applicationComponent)
                .fragmentModule(FragmentModule(this))
                .build()

        aboutComponent.inject(this)
    }

   /* override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        return rootView

    }*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        return rootView
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val tvData = view!!.findViewById<TextView>(R.id.tvData) as TextView

        tvData.setText(homeViewModel?.getSomeData())
    }

}