package com.example.fitapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fitapp.activities.MainActivity

import com.example.fitapp.databinding.ActivitySigninBinding

class Signin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signin)


        // this
        val binding: ActivitySigninBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_signin)

        // click listener for layout
        binding.btnSignin.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)


        }

        binding.txtForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
        binding.imgBackButton.setOnClickListener {
            val intent = Intent(this, Slides::class.java)
            startActivity(intent)
        }
        }
    }
