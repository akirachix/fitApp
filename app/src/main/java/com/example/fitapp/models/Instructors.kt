package com.example.fitapp.models

import com.google.gson.annotations.SerializedName


data class Instructors(
    var image: Int,
    var name: String,
    @SerializedName("time_available") var timeAvailable: String
)
