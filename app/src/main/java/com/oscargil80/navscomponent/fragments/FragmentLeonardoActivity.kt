package com.oscargil80.navscomponent.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.ActivityFragmentLeonardoBinding
import com.oscargil80.navscomponent.fragments.fragments.FragmentLeo1


class FragmentLeonardoActivity : AppCompatActivity() {

    private lateinit var binding:ActivityFragmentLeonardoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentLeonardoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FragmentCont, FragmentLeo1())
            commit()
        }
    }
}