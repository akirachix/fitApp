package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fitapp.databinding.ActivityResetPasswordBinding
import android.widget.Toast

import androidx.annotation.NonNull

import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth


class ResetPassword : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityResetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
//        firebaseAuth = FirebaseAuth.getInstance();

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
//        firebaseAuth.sendPasswordResetEmail("amondiloyce@gmail.com")
//            .addOnCompleteListener(OnCompleteListener<Void?> { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(
//                        this@ResetPassword,
//                        "We have sent you instructions to reset your password!",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                } else {
//                    Toast.makeText(
//                        this@ResetPassword,
//                        "Failed to send reset email!",
//                        Toast.LENGTH_SHORT
//                    ).show()
//            }
//            })
//    }

//}