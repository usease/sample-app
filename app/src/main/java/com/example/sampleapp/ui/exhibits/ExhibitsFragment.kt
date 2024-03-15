package com.example.sampleapp.ui.exhibits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sampleapp.R
import com.example.sampleapp.databinding.FragmentExhibitsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExhibitsFragment : Fragment(R.layout.fragment_exhibits) {

    private lateinit var binding: FragmentExhibitsBinding
    private val vm: ExhibitsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExhibitsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tv.text = vm.getExhibits()
    }
}
