package com.example.fitapp

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fitapp.activities.MainActivity
import com.example.fitapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_signup.*


class Signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    lateinit var firebaseUser: FirebaseUser
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()




        binding.btnCreateAccount.setOnClickListener {

            var firsName = binding.etFirstName.text.toString()
            var lastName = binding.etLastName.text.toString()
            var email = binding.etEmail.text.toString()
            var password = binding.etPassword.text.toString()
            var confirmPassword = binding.tvConfirmPassword.text.toString()

            if (firsName.isEmpty()) {
                Toast.makeText(this, "FirstName can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (lastName.isEmpty()) {
                Toast.makeText(this, "LastName can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (email.isEmpty()) {


                Toast.makeText(this, "Email can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }
            if (password.isEmpty()) {
                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }
            if (confirmPassword.isEmpty()) {
                Toast.makeText(this, "ConfirmPassword can't be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener

            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Password not the same", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, Signin::class.java))
                        finish()
                    }
                }
        }
        // click listener for layout
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }
    }
    }






