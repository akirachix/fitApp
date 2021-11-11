package com.example.fitapp.Repositories

import com.example.fitapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MpessaRepository (val service:ApiInterface){
    suspend fun  fetchPayments(accessToken:String) = withContext(Dispatchers.IO){
        var response=service.fetchPayments(accessToken)
        response.body()
    }
}