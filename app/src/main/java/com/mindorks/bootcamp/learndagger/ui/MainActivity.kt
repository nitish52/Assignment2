package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : FragmentActivity() {


    @set:Inject
    internal var  mainViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependency()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val tvData = findViewById<TextView>(R.id.tvData) as TextView

         tvData.setText(mainViewModel?.getSomeData())

         showHomeFragment()
    }


    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as MyApplication).applicationComponent)
                .build()

        activityComponent.inject(this)
    }

     fun showHomeFragment() {
        //if (supportFragmentManager.findFragmentByTag(AboutFragment.TAG) == null) {
            supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
                  //  .setCustomAnimations(AnimType.FADE.getAnimPair().first, AnimType.FADE.getAnimPair().second)
                    .replace(R.id.frame_container, HomeFragment().newInstance())
                    .commit()
       /* } else {
            // Maybe an animation like shake hello text
        }*/
    }


}