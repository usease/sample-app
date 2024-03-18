package com.example.sampleapp.ui.exhibits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleapp.R
import com.example.sampleapp.base.BaseFragment
import com.example.sampleapp.databinding.FragmentExhibitsBinding
import com.example.sampleapp.ui.exhibits.paging.ExhibitComparator
import com.example.sampleapp.ui.exhibits.paging.ExhibitsAdapter
import kotlinx.coroutines.flow.collectLatest
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
        setupAdapter()
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

    private fun setupAdapter() {
        val pagingAdapter = ExhibitsAdapter(ExhibitComparator) {
            navigateToDetails(it)
        }
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = pagingAdapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.exhibits.collectLatest { pagingData ->
                pagingAdapter.submitData(pagingData)
            }
        }
    }

    private fun navigateToDetails(objectNumber: String) {
        findNavController().navigate("exhibitDetails",
            navOptions {
                anim {
                    enter = android.R.animator.fade_in
                    exit = android.R.animator.fade_out
                }
            }
        )
    }
}
