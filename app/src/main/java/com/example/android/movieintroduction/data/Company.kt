package com.example.android.movieintroduction.data

import com.google.gson.annotations.SerializedName

data class Company(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("logo_path")
    val logoPath: String,

    @SerializedName("origin_country")
    val country: String
)
