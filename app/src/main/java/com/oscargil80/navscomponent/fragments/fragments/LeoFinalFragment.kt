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

        var  datos = datos(args.nombre,args.apellido, args.edad, args.ciudad, args.estado, args.direccion, args.primaria, args.segundaria, args.univ)
        llenarcampos(datos)
        binding.btnIrDialog.setOnClickListener {
            findNavController().navigate(R.id.infoDialog)
        }
    }

    private fun llenarcampos(datos: datos) {
        binding.tvNombre.setText(datos.nombre)
        binding.tvApellido.setText(datos.apellido)
        binding.tvEdad.setText(datos.edad)

        binding.tvCiudad.setText(datos.ciudad)
        binding.tvEstado.setText(datos.estado)
        binding.tvDireccion.setText(datos.direccion)

        binding.tvPrimaria.setText(datos.primaria)
        binding.tvSegundaria.setText(datos.segundaria)
        binding.tvUniv.setText(datos.univ)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}