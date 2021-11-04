package com.example.fitapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fitapp.databinding.ActivitySignupBinding


class Signup : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // this
        val binding: ActivitySignupBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_signup)


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

