package com.example.android.movieintroduction.data

import com.google.gson.annotations.SerializedName

data class VideoResult(

    @SerializedName("results")
    val videos: List<Video>
)
