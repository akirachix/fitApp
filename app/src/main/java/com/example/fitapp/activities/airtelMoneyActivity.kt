package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityAirtelMoneyBinding

class airtelMoneyActivity : AppCompatActivity() {
    lateinit var binding: ActivityAirtelMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airtel_money)
        binding = ActivityAirtelMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    fun onClick() {
        binding.btnCard.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)

        }
        binding.btnMpesa.setOnClickListener {
            val intent = Intent(baseContext, MpesaActivity::class.java)
            startActivity(intent)
        }

        binding.btnAirtel.setOnClickListener {
            val intent = Intent(baseContext, airtelMoneyActivity::class.java)
            startActivity(intent)
        }

        binding.btnMobile.setOnClickListener {
            val intent = Intent(baseContext, mobileMoneyActivity::class.java)
            startActivity(intent)
        }
        binding.btnPay2.setOnClickListener {
            val intent = Intent(baseContext,Congrates::class.java)
            startActivity(intent)
        }
        binding.tvCancel.setOnClickListener {
            val intent = Intent(baseContext, InstractorScreen ::class.java)
            startActivity(intent)
        }

    }

}