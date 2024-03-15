package com.example.sampleapp.ui.exhibits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.sampleapp.R
import com.example.sampleapp.base.BaseFragment
import com.example.sampleapp.databinding.FragmentExhibitsBinding
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExhibitsFragment : BaseFragment(R.layout.fragment_exhibits) {

    override val TAG: String = ExhibitsFragment::class.simpleName!!

    private lateinit var binding: FragmentExhibitsBinding
    private val viewModel: ExhibitsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExhibitsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        collectUiState()
    }

    private fun collectUiState() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect {
                    // Events
                    it.showMessage?.getContentIfNotHandled()?.let { message ->
                        showAndLogD(message)
                    }

                    it.showErrorMessage?.getContentIfNotHandled()?.let { message ->
                        showAndLogE(message)
                    }

                    it.exhibits?.getContentIfNotHandled()?.let {
                        binding.tv.text = it.toString()
                    }
                }
            }
        }
    }
}
