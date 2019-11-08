package com.example.luifergram.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.luifergram.R
import com.example.luifergram.views.fragments.HomeFragment
import com.example.luifergram.views.fragments.ProfileFragment
import com.example.luifergram.views.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        val bottomNavigator = findViewById(R.id.bottombar) as BottomNavigationView
        bottomNavigator.selectedItemId = R.id.navigation_home
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment, homeFragment.javaClass.simpleName)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit()

        bottomNavigator.setOnNavigationItemSelectedListener {
            if(it.itemId == R.id.navigation_home){
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment, homeFragment.javaClass.simpleName)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit()
                return@setOnNavigationItemSelectedListener true
            }else if(it.itemId == R.id.navigation_profile){
                val profileFragment = ProfileFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, profileFragment, profileFragment.javaClass.simpleName)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit()
                return@setOnNavigationItemSelectedListener true
            }else if(it.itemId == R.id.navigation_search){
                val searchFragment = SearchFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, searchFragment, searchFragment.javaClass.simpleName)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit()
                return@setOnNavigationItemSelectedListener true
            }
            false
        }
    }
}
