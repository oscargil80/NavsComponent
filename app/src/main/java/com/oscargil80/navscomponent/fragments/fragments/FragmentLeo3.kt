package com.oscargil80.navscomponent.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.FragmentLeo3Binding


class FragmentLeo3 : Fragment() {

    private var _binding: FragmentLeo3Binding? = null
    private val binding get() = _binding!!
    private val args: FragmentLeo3Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeo3Binding.inflate(inflater, container, false)
        return    binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFrag4leo.setOnClickListener{
            if(binding.PrimariaDatosLeo.text.toString().isBlank() || binding.SegundariaDatosLeo.text.toString().isBlank() || binding.UnivDatosLeo.text.toString().isBlank())
            {
                Toast.makeText(requireContext(), "Completa todos los campos", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val primaria = binding.PrimariaDatosLeo.text.toString()
            val segundaria = binding.SegundariaDatosLeo.text.toString()
            val univ =  binding.UnivDatosLeo.text.toString()

            var action = FragmentLeo3Directions.actionFragmentLeo3ToLeoFinalFragment(
                nombre = args.nombre,
                edad = args.edad,
                ciudad =  args.ciudad,
                univ = univ
            )



        findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}