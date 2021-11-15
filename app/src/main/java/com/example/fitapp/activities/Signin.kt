package com.example.fitapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fitapp.activities.MainActivity
import com.example.fitapp.databinding.ActivitySigninBinding
import com.example.fitapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize


class Signin : AppCompatActivity() {
    lateinit var binding: ActivitySigninBinding
    private lateinit var auth: FirebaseAuth
    lateinit var firebaseUser: FirebaseUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Firebase.initialize(this)
        auth = FirebaseAuth.getInstance()
        // click listener for layout
        binding.btnSignin.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
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

        binding.btnSignin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            // signin with firebase
        fun createUser(email:String,password:String){
            auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Log.e("Task Message","Task is successful")


//                            startActivity(Intent(this, MainActivity::class.java))
//                            finish()
                        }
                    else{
                        Log.e("Task Message","Failed"+task.exception)
                        }


                }
        }
    }
        }
    private fun sendEmailVerification() {
        firebaseUser.let {
            it.sendEmailVerification().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this,"Email has been Sent to "+firebaseUser.email,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val user: FirebaseUser? = auth.currentUser
        user?.let {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}





