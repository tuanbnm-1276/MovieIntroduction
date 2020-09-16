package com.example.android.movieintroduction.base

import android.os.Bundle

interface BaseView {
    val contentViewId: Int
    fun initializeView(saveInstanceState: Bundle?)
    fun initializeComponents()
}
