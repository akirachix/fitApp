package com.example.fitapp.api

import com.example.fitapp.Signin
import com.example.fitapp.Signup
import com.example.fitapp.models.*
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST ("/user/signup")
    suspend fun signupUser( @Body signupRequest: SignupRequest): retrofit2.Response<SignupResponse>

    @POST ("/user/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): retrofit2.Response<LoginResponse>

    @GET ("/workouts")
    suspend fun fetchWorkouts(@Header("Authorization") token: String): retrofit2.Response<List<Workouts>>
    @GET ("/logins")
    suspend fun fetchLogins(@Header("Authoriation") token: String):retrofit2.Response<List<Signin>>
    @GET("/signups")
    suspend fun  fetchSignups(@Header("Authorization") token: String):retrofit2.Response<List<Signup>>
    @POST("/instructors/signup")
    suspend fun singupInstructor(@Body signupRequest: SignupRequest):retrofit2.Response<SignupResponse>
    @POST("/instructor/signin")
    suspend fun loginInstructor(@Body loginRequest: LoginRequest):retrofit2.Response<LoginResponse>
    @GET("instructors")
    suspend fun  fetchInstructors(@Header("Authentication") token: String):retrofit2.Response<List<Instructors>>
    @POST("user/payment")
    suspend fun paymentUser(@Body paymentRequest:PaymentRequest):retrofit2.Response<PaymentResponse>
    @GET("payments")
    suspend fun fetchPayments(@Header("Authentication") token: String):retrofit2.Response<List<PaymentResponse>>
}