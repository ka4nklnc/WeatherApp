package com.puasnow.spring.core.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import com.puasnow.spring.R
import com.puasnow.spring.databinding.ActivityMainBinding

class MainActivity:AppCompatActivity() {
    lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        with(mBinding){
           // fragment .findNavController().setGraph(R.navigation.nav_dashboard)
        }
    }
}