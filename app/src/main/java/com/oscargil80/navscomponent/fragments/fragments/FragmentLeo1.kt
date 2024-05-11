package com.oscargil80.navscomponent.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.FragmentLeo1Binding


class FragmentLeo1 : Fragment() {
    private var _binding: FragmentLeo1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeo1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFrag2leo.setOnClickListener{
            if(binding.NombreDatosLeo.text.toString().isBlank() || binding.ApellidoDatosLeo.text .toString().isBlank() || binding.EdadDatosLeo.text.toString().isBlank())
            {
                Toast.makeText(requireContext(), "Completa todos los campos", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val nombre = binding.NombreDatosLeo.text.toString()
            val apellido = binding.ApellidoDatosLeo.text.toString()
            val edad =  binding.EdadDatosLeo.text.toString()

            val action = FragmentLeo1Directions.actionFragmentLeo1ToFragmentLeo2(nombre, edad)
            findNavController().navigate(action)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
