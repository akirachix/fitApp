package com.example.fitapp.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitapp.R


import android.content.Intent
import com.example.fitapp.activities.Goals
import com.example.fitapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        binding.btnsetgoals.setOnClickListener {
            val intent = Intent(context, Goals::class.java)
            startActivity(intent)
        }
        return binding.root
    }


}