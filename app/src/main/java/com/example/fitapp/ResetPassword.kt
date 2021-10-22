package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.databinding.ActivityForgotPasswordBinding
import com.example.fitapp.databinding.ActivityResetPasswordBinding

class ResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_reset_password)

        val binding: ActivityResetPasswordBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_reset_password)

        binding.btnchanges.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
    }
}
}