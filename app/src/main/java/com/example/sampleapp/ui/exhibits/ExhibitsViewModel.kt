package com.example.sampleapp.ui.exhibits

import androidx.lifecycle.ViewModel
import com.example.sampleapp.di.viewModelsModule
import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.repository.MuseumRepoImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ExhibitsViewModel (private val repo: MuseumRepo): ViewModel() {

//class ExhibitsViewModel: ViewModel() {

//     Expose screen UI state
//    private val _uiState = MutableStateFlow(DiceUiState())
//    val uiState: StateFlow<DiceUiState> = _uiState.asStateFlow()
// Handle business logic
//    fun rollDice() {
//        _uiState.update { currentState ->
//            currentState.copy(
//                firstDieValue = Random.nextInt(from = 1, until = 7),
//                secondDieValue = Random.nextInt(from = 1, until = 7),
//                numberOfRolls = currentState.numberOfRolls + 1,
//            )
//        }
//    }
    suspend fun getExhibits(): String {
        return repo.getExhibits()
//        return "AAAAA"
    }
}