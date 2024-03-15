package com.example.sampleapp.network

/**
 * Status of a resource that is provided to the UI.
 *
 * These are usually created by the Repository classes where they return
 * latest data to the UI with its fetch status.
 */
enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}