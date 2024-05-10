package com.oscargil80.navscomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oscargil80.navscomponent.databinding.ActivityFragmentLeonardoBinding


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