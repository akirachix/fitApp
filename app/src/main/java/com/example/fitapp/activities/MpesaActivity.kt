package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivityMpesaBinding


class MpesaActivity : AppCompatActivity() {
            lateinit var binding: ActivityMpesaBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMpesaBinding.inflate(layoutInflater)
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
                binding.btnPay1.setOnClickListener {
                    val intent = Intent(baseContext,Congrates::class.java)
                    startActivity(intent)
                }
                binding.tvCancel.setOnClickListener {
                    val intent = Intent(baseContext,InstractorScreen::class.java)
                    startActivity(intent)
                }

            }
        }
