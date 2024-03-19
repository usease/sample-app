package com.example.sampleapp.ui.exhibit_details

import com.example.sampleapp.domain.exhibit_details.ExhibitDetails
import com.example.sampleapp.utils.Event

data class ExhibitDetailsState (
    val isLoading: Boolean = false,
    // Events
    val showMessage: Event<String>? = null,
    val showErrorMessage: Event<String>? = null,
    val exhibitDetails:  Event<ExhibitDetails>? = null,
)