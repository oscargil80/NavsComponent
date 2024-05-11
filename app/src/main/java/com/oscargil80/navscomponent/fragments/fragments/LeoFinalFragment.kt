package com.oscargil80.navscomponent.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.oscargil80.navscomponent.R
import com.oscargil80.navscomponent.databinding.FragmentLeoFinalBinding
import com.oscargil80.navscomponent.fragments.fragments.datos


class LeoFinalFragment : Fragment() {
    private var _binding:FragmentLeoFinalBinding? = null
    private val binding get() = _binding!!

    private val args:LeoFinalFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeoFinalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvNombre.text = "${args.nombre}, ${args.univ}"
        binding.btnIrDialog.setOnClickListener {
            findNavController().navigate(R.id.infoDialog)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}