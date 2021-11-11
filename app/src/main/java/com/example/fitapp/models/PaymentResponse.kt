package com.example.fitapp.models

import com.google.gson.annotations.SerializedName

data class PaymentResponse(
    var message:String,
    @SerializedName("access_token") var accessToken: String,
    @SerializedName("phone_number") var phoneNumber:String,
    var amount:Int,
    @SerializedName("till_number") var tillNumber:Int
)
