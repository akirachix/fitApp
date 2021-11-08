package com.example.fitapp.api

import com.example.fitapp.models.*
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST ("/user/signup")
    suspend fun signupUser( @Body signupRequest: SignupRequest): retrofit2.Response<SignupResponse>

    @POST ("/user/signup")
    suspend fun loginUser(@Body lodinRequest: LoginRequest): retrofit2.Response<LoginResponse>

    @GET ("/workouts")
    suspend fun fetchWorkouts(@Header("Authorization") token: String): retrofit2.Response<List<Workouts>>

}