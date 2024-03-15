package com.example.sampleapp.ui.exhibits

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleapp.di.viewModelsModule
import com.example.sampleapp.network.ApiEmptyResponse
import com.example.sampleapp.network.ApiErrorResponse
import com.example.sampleapp.network.ApiSuccessResponse
import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.repository.MuseumRepoImpl
import com.example.sampleapp.utils.Event
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ExhibitsViewModel (private val repo: MuseumRepo): ViewModel() {

    // Expose screen UI state
    private val _uiState = MutableStateFlow(ExhibitsState())
    val uiState: StateFlow<ExhibitsState> = _uiState.asStateFlow()

    init {
        getExhibits()
    }

    fun getExhibits() {
        viewModelScope.launch {
            when (val response = repo.getExhibits()) {
                is ApiSuccessResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            exhibits = Event(response.body.artObjects)
                        )
                    }
                }
                is ApiEmptyResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            showMessage = Event( "Empty response received while loading exhibits.")
                        )
                    }
                }
                is ApiErrorResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            showErrorMessage = Event( "Error occurred while loading exhibits. " + response.errorMessage)
                        )
                    }
                }
            }
        }
    }
}