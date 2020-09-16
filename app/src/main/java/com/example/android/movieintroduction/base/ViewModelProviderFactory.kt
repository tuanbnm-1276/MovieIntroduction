package com.example.android.movieintroduction.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelProviderFactory<V: Any>(private var viewHolder: V):ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(viewHolder::class.java)){
            return viewHolder as T
        }

        throw IllegalArgumentException("Unknown class name")
    }
}
