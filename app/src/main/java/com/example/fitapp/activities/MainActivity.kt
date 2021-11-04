package com.example.fitapp.activities
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    fun setupViews() {
        val bottomNavView : BottomNavigationView = binding.bottomNavView;
        navController = Navigation.findNavController(this@MainActivity, R.id.fragNavHost)
        NavigationUI.setupWithNavController(bottomNavView, navController)

    }

}