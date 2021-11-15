package com.example.fitapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var retrofit= Retrofit.Builder()
        .baseUrl("https://fitapp-daraja-api.herokuapp.com/api/v1/online/lipa")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(apiInterface: Class<T>):T{
        return  retrofit.create(apiInterface)
    }

}