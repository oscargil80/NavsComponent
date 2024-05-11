package com.oscargil80.navscomponent.fragments.dialogs

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.oscargil80.navscomponent.databinding.InfoDialogBinding

class InfoDialog: DialogFragment () {

    private var _binding : InfoDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = InfoDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOk.setOnClickListener {
            this.dismiss()
        }




    }

    override fun onDestroy() {
        super.onDestroy()
       _binding = null

    }

}