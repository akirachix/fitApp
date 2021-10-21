package com.example.fitapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "signupDetails")
data class SignUp(
    @PrimaryKey(autoGenerate = true)
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var confirmPassword: String,


)
