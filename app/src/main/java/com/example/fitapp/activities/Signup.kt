package com.example.fitapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fitapp.databinding.ActivitySignupBinding


class Signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // this


        // click listener for layout
        binding.btnCreateAccount.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
        }

        // click listener for layout
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }
        binding.btnCreateAccount.setOnClickListener {
            val intent = Intent(this, Signin ::class.java)
            startActivity(intent)
        }
        binding.imgBackButton.setOnClickListener {
            val intent = Intent(this, Slides ::class.java)
            startActivity(intent)
        }
    }
}

