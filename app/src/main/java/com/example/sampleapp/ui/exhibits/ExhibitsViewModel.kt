package com.example.sampleapp.ui.exhibits

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.sampleapp.network.ApiEmptyResponse
import com.example.sampleapp.network.ApiErrorResponse
import com.example.sampleapp.network.ApiSuccessResponse
import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.ui.exhibits.paging.ExhibitsPagingSource
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

    val exhibits = Pager(
        PagingConfig(pageSize = 10)
    ) {
        ExhibitsPagingSource(repo)
    }.flow
        .cachedIn(viewModelScope)
}