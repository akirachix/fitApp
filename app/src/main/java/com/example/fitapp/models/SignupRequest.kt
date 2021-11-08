package com.example.fitapp.models

import com.google.gson.annotations.SerializedName

data class SignupRequest(
    @SerializedName("first_name") var firstName: String,
    @SerializedName("last_name") var lastName: String,
    var email: String,
    var password: String,
   @SerializedName("confirm_password") var confirmPassword: String
)
