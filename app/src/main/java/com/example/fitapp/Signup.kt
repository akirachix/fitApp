package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivitySignupBinding
import com.example.fitapp.databinding.ActivitySplashBinding

class Signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)




            var firstname = binding.etFirstname.text.toString()

            if (firstname.isEmpty()) {
                binding.etemail.setError("FirstName Required")

            }
            var lastname = binding.etlastname.text.toString()

            if (lastname.isEmpty()) {
                binding.etpassword.setError("LastName is required")
            }

            var password= binding.etpassword.text.toString()

            if (password.isEmpty()) {
                binding.etpassword.setError("Password  is required")
            }
            var confirmpassword= binding.etconfirmpassword.text.toString()

            if (password.isEmpty()) {
                binding.etconfirmpassword.setError("Password  is required")
            }


        binding.btncreate.setOnClickListener {
            var intent = Intent(baseContext, Signup ::class.java)
            startActivity(intent)
        }
//        binding.btnlogin.setOnClickListener {
//            var intent = Intent(baseContext, Signin ::class.java)
//            startActivity(intent)
//        }


    }
}

