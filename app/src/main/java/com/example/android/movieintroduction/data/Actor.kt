package com.example.android.movieintroduction.data

import com.google.gson.annotations.SerializedName

data class Actor(
    @SerializedName("id")
    val id: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("profile_path")
    val profilePath: String,

    @SerializedName("character")
    val character: String,

    @SerializedName("birthday")
    val birthday: String,

    @SerializedName("biography")
    val biography: String,

    @SerializedName("place_of_birth")
    val place: String,

    @SerializedName("popularity")
    val popularity: String,

    @SerializedName("gender")
    val gender: String,

    @SerializedName("known_for_department")
    val department: String
)
