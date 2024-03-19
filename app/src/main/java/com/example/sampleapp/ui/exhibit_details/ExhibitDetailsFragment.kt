package com.example.sampleapp.ui.exhibit_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.sampleapp.R
import com.example.sampleapp.base.BaseFragment
import com.example.sampleapp.constants.Navigation
import com.example.sampleapp.databinding.FragmentExhibitDetailsBinding
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExhibitDetailsFragment: BaseFragment(R.layout.fragment_exhibit_details) {

    override val TAG: String = ExhibitDetailsFragment::class.simpleName!!

    private lateinit var binding: FragmentExhibitDetailsBinding
    private val viewModel: ExhibitDetailsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExhibitDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val objectNumber = arguments?.getString(Navigation.Args.object_number)
        viewModel.getExhibitDetails(objectNumber)
        collectUiState()
    }

    private fun collectUiState() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect {
                    if(it.isLoading) {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.tvMessage.visibility = View.INVISIBLE
                        binding.gContent.visibility = View.INVISIBLE
                    } else {
                        binding.progressBar.visibility = View.INVISIBLE

                    }

                    // Events
                    it.showMessage?.getContentIfNotHandled()?.let { message ->
                        showAndLogD(message)
                        binding.tvMessage.text = message
                        binding.tvMessage.visibility = View.VISIBLE
                    }

                    it.showErrorMessage?.getContentIfNotHandled()?.let { message ->
                        showAndLogE(message)
                        binding.tvMessage.text = message
                        binding.tvMessage.visibility = View.VISIBLE
                    }

                    it.exhibitDetails?.getContentIfNotHandled()?.let { exhibitDetails ->
                        (requireActivity() as AppCompatActivity).supportActionBar?.title = exhibitDetails.title

                        binding.tvObjectNumber.text = exhibitDetails.objectNumber
                        binding.tvMakerLine.text = exhibitDetails.makerLine
                        binding.tvDesc.text = exhibitDetails.desc
                        Picasso.get().load(exhibitDetails.imageUrl).into(binding.iv)

                        binding.tvMaterials.text = if(exhibitDetails.materials.isNotEmpty())
                            String.format(getString(R.string.materials), exhibitDetails.materials.joinToString(", "))
                        else
                            String.format(getString(R.string.materials), getString(R.string.na))

                        binding.tvTechniques.text = if(exhibitDetails.techniques.isNotEmpty())
                            String.format(getString(R.string.techniques), exhibitDetails.techniques.joinToString(", "))
                        else
                            String.format(getString(R.string.techniques), getString(R.string.na))

                        binding.gContent.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
}