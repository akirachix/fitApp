package com.example.fitapp.Repositories

import com.example.fitapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SignupRepository (val service:ApiInterface){
    suspend fun fetchSignups(accessToken :String) = withContext(Dispatchers.IO){
        var response = service.fetchSignups(accessToken)
        response.body()
    }
}