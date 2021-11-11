package com.example.fitapp.models

import com.google.gson.annotations.SerializedName

data class PaymentRequest(
    @SerializedName("till_number") var tillNumber:Int,
    var amount:Int,
    @SerializedName("pin_number") var pinNumber:Int
)

