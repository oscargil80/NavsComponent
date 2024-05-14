package com.oscargil80.navscomponent.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.ActivityFragmentLeonardoBinding
import com.oscargil80.navscomponent.fragments.fragments.*


class FragmentLeonardoActivity : AppCompatActivity() {

    private lateinit var binding:ActivityFragmentLeonardoBinding
    private lateinit var toogle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentLeonardoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toogle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer  )
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navDatosPersonales -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.navHostFragment, FragmentLeo1())
                        commit()
                    }
                }
                R.id.navDireccion -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.navHostFragment, FragmentLeo2())
                        commit()
                    }
                }
                R.id.navEducacion -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.navHostFragment, FragmentLeo3())
                        commit()
                    }
                }

                R.id.navFinal -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.navHostFragment, LeoFinalFragment())
                        commit()
                    }
                }

            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)

    }
}