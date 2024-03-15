package com.example.sampleapp.ui.exhibits

import com.example.sampleapp.models.ArtObject
import com.example.sampleapp.utils.Event

data class ExhibitsState(
    // Events
    val showMessage: Event<String>? = null,
    val showErrorMessage: Event<String>? = null,
    val exhibits:  Event<List<ArtObject>>? = null,
)