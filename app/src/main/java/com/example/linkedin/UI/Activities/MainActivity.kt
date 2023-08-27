package com.example.linkedin.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.linkedin.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val navHost=supportFragmentManager.findFragmentById(R.id.frJobsFragment) as NavHostFragment
        val navController=navHost.navController
        val bnvBNV:BottomNavigationView=findViewById(R.id.bnvBottomNavigation)
        bnvBNV.setupWithNavController(navController)

    }
}