package com.example.fitapp.Repositories

import com.example.fitapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WorkoutsRepository( val service: ApiInterface) {
    suspend fun fetchWorkouts(accessToken: String)
    = withContext(Dispatchers.IO){
        var response = service.fetchWorkouts(accessToken)
        response.body()
    }
}