package com.example.ejerciciopaniamor.ui.declaracionprincipios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ejerciciopaniamor.databinding.FragmentDeclaracionprincipiosBinding

class DeclaracionPrincipiosFragment : Fragment() {
    private var _binding: FragmentDeclaracionprincipiosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDeclaracionprincipiosBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}