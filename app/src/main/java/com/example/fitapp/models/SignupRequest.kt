package com.example.fitapp.models

data class SignupRequest(
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var confirmPassword: String
)
