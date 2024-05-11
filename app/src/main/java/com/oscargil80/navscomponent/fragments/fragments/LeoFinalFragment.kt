package com.oscargil80.navscomponent.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.oscargil80.navscomponent.databinding.FragmentLeoFinalBinding
import com.oscargil80.navscomponent.fragments.fragments.datos


class LeoFinalFragment : Fragment() {
    private var _binding:FragmentLeoFinalBinding? = null
    private val binding get() = _binding!!

    private  var nombre:String? = null
    private  var apellido:String? = null
    private  var edad:String? = null

    private  var ciudad:String? = null
    private  var estado:String? = null
    private  var direccion:String? = null

    private  var primaria:String? = null
    private  var segundaria:String? = null
    private  var univ:String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeoFinalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragmentResultListener("datos"){ _, bundle ->
            nombre= bundle.getString("nombre")
            apellido= bundle.getString("apellido")
            edad= bundle.getString("edad")
        }
        setFragmentResultListener("ubicacion"){ _, bundle ->
            ciudad= bundle.getString("ciudad")
            estado= bundle.getString("estado")
            direccion= bundle.getString("direccion")
        }
        setFragmentResultListener("educacion"){ _, bundle ->
            primaria= bundle.getString("primaria")
            segundaria= bundle.getString("segundaria")
            univ= bundle.getString("univ")
            var  datos = datos(nombre,apellido, edad, ciudad,estado, direccion, primaria, segundaria, univ)
            llenarcampos(datos)
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