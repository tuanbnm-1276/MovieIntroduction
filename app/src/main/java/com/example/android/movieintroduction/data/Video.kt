package com.example.android.movieintroduction.data

import com.google.gson.annotations.SerializedName

data class Video(
    @SerializedName("id")
    val id: String,

    @SerializedName("iso_639_1")
    val mIso639: String,

    @SerializedName("iso_3166_1")
    val mIso3166: String,

    @SerializedName("key")
    val key: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("site")
    val site: String,

    @SerializedName("size")
    val size: String,

    @SerializedName("type")
    val type: String
)
