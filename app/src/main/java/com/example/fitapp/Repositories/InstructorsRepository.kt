package com.example.fitapp.Repositories

import com.example.fitapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class InstuctorsRepository (val service:ApiInterface){
    suspend fun  fetchInstructors(accessToken:String) = withContext(Dispatchers.IO){
        var response= service.fetchInstructors(accessToken)
        response.body()
    }
}