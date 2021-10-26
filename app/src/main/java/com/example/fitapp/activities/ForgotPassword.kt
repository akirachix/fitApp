package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.databinding.ActivityForgotPasswordBinding
import com.example.fitapp.databinding.ActivitySigninBinding
import com.example.fitapp.databinding.ActivitySignupBinding

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forgot_password)
        val binding: ActivityForgotPasswordBinding= DataBindingUtil.setContentView(
            this, R.layout.activity_forgot_password)

        binding.btnrequest.setOnClickListener {
            val intent = Intent(this, ResetPassword::class.java)
            startActivity(intent)
        }



    }
}