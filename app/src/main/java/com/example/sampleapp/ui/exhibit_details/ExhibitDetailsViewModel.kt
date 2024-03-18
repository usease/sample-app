package com.example.sampleapp.ui.exhibit_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleapp.network.ApiEmptyResponse
import com.example.sampleapp.network.ApiErrorResponse
import com.example.sampleapp.network.ApiSuccessResponse
import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.utils.Event
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ExhibitDetailsViewModel (private val repo: MuseumRepo): ViewModel() {

    private val _uiState = MutableStateFlow(ExhibitDetailsState())
    val uiState: StateFlow<ExhibitDetailsState> = _uiState.asStateFlow()

    fun getExhibitDetails(objectNumber: String?) {
        if(objectNumber == null) {
            _uiState.update { currentState ->
                currentState.copy(
                    showErrorMessage = Event("Object number of the exhibit is missing.")
                )
            }
            return
        }
        _uiState.update { currentState ->
            currentState.copy(
                isLoading = true
            )
        }
        viewModelScope.launch {
            when (val response = repo.getExhibitDetails(objectNumber)) {
                is ApiSuccessResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            isLoading = false,
                            exhibitDetails = Event(response.body)
                        )
                    }
                }
                is ApiEmptyResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            isLoading = false,
                            showMessage = Event( "Empty response received while loading exhibit details.")
                        )
                    }
                }
                is ApiErrorResponse -> {
                    _uiState.update { currentState ->
                        currentState.copy(
                            isLoading = false,
                            showErrorMessage = Event( "Error occurred while loading exhibit details. " + response.errorMessage)
                        )
                    }
                }
            }
        }
    }
}