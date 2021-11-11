package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivityResetPasswordBinding


class ResetPassword : AppCompatActivity() {
    lateinit var binding: ActivityResetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnchanges.setOnClickListener {
            val intent = Intent(this, Congration ::class.java)
            startActivity(intent)
        }

        binding.imgBackButton.setOnClickListener {
            val intent = Intent(this, ForgotPassword ::class.java)
            startActivity(intent)
        }
}
}