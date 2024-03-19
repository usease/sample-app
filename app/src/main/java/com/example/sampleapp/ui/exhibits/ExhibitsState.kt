package com.example.sampleapp.ui.exhibits

import com.example.sampleapp.domain.exhibits.Exhibit
import com.example.sampleapp.utils.Event

data class ExhibitsState(
    // Events
    val showMessage: Event<String>? = null,
    val showErrorMessage: Event<String>? = null
)