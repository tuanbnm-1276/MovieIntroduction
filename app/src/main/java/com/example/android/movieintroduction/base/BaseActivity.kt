package com.example.android.movieintroduction.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import com.example.android.movieintroduction.R
import com.example.android.movieintroduction.exceptions.NetworkException
import com.example.android.movieintroduction.exceptions.ServiceException

abstract class BaseActivity : AppCompatActivity(),
    BaseView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contentViewId)
        initializeView(savedInstanceState)
        initializeComponents()
    }

    private fun getCurrentFragment(): Fragment? {
        val currentNavHost = supportFragmentManager.findFragmentById(R.id.navHost)
        val currentFragmentClassName =
            (currentNavHost?.findNavController()?.currentDestination as FragmentNavigator.Destination)
                .className
        return currentNavHost.childFragmentManager.fragments.filterNotNull().find {
            it.javaClass.name == currentFragmentClassName
        }
    }

    override fun onBackPressed() {
        getCurrentFragment()?.let {
            if (it is BaseFragment<*> && it.onBackPressed()){
                return
            }
        }
        super.onBackPressed()
    }

    fun handleBusinessException(throwable: Throwable){
        if(throwable is NetworkException) return
        if (throwable is ServiceException) return
    }
}
