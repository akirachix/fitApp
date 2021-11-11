package com.example.fitapp.Repositories

import com.example.fitapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginRepository (val service:ApiInterface){
    suspend fun  fetchLogins(accessToken: String)= withContext(Dispatchers.IO){
        var response = service.fetchLogins(accessToken)
        response.body()
    }
}