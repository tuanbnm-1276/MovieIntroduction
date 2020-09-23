package com.example.android.movieintroduction.data

import com.google.gson.annotations.SerializedName

data class Movie(

    @SerializedName("id")
    val id: Int,

    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @SerializedName("genres")
    val genres: List<Genre>,

    @SerializedName("title")
    val title: String,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("production_companies")
    val productionCompanies: List<Company>,

    val releaseDate: String,

    val runtime: Int,

    val voteAverage: Double,

    @SerializedName("videos")
    val videoResult: VideoResult
)