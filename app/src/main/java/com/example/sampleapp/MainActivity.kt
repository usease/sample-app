package com.example.sampleapp

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.sampleapp.base.BaseActivity
import com.example.sampleapp.ui.exhibit_details.ExhibitDetailsFragment
import com.example.sampleapp.ui.exhibits.ExhibitsFragment

class MainActivity : BaseActivity(R.layout.activity_main) {

    override val TAG: String = MainActivity::class.simpleName!!

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        navController = navHostFragment.navController
        navController.graph = navController.createGraph(
            startDestination = "exhibits"
        ) {
            // Associate each destination with one of the route constants.
            fragment<ExhibitsFragment>("exhibits") {
                label = getString(R.string.rijks_museum)
            }

            fragment<ExhibitDetailsFragment>("exhibitDetails") {
                label = getString(R.string.exhibit_details)
            }
        }
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        if(navController.previousBackStackEntry == null)
            super.onBackPressed()
        else
            navController.navigateUp()
    }
}