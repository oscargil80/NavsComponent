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
import androidx.navigation.fragment.navArgs
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.FragmentLeo2Binding


class FragmentLeo2 : Fragment() {
  private var _binding:FragmentLeo2Binding? = null
   private val binding get() = _binding!!

    private val args: FragmentLeo2Args by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeo2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFrag3leo.setOnClickListener {
            if(binding.CiudadDatosLeo.text.toString().isBlank() || binding.estadoDatosLeo.text.toString().isBlank() || binding.DireccionDatosLeo.text.toString().isBlank())
            {
                Toast.makeText(requireContext(), "Completa todos los campos", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val ciudad = binding.CiudadDatosLeo.text.toString()
            val estado = binding.estadoDatosLeo.text.toString()
            val direccion =  binding.DireccionDatosLeo.text.toString()

            var action = FragmentLeo2Directions.actionFragmentLeo2ToFragmentLeo3(
                nombre = args.nombre,
                edad = args.edad,
                ciudad = ciudad
            )


            findNavController().navigate(action)
        }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}