package com.example.fitapp.models

import com.google.gson.annotations.SerializedName

data class SignupResponse(
    var message: String,
    @SerializedName("access_token") var  accessToken: String,
    @SerializedName("user_id") var userId:String

)
