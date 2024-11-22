package com.example.fooddelivery.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fooddelivery.Model.RequestBody
import com.example.fooddelivery.Model.Suggestion
import com.example.fooddelivery.Model.suggestionService
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {
    var address by mutableStateOf("")
    fun updateAddress(value: String) {
        address = value
    }

    private val _suggestionState = mutableStateOf(SuggestionState())
    val suggestionsState: State<SuggestionState> = _suggestionState

    init {
        fetchSuggestions("")
    }

    private var job: Job? = null
    fun fetchSuggestions(value: String){
        job?.cancel()
        job = viewModelScope.launch {
            try {
                delay(300)
                val requestBody = RequestBody(value)
                val response = suggestionService.getSuggestions(
                    "application/json",
                    "application/json",
                    "Token d6a2ff4513b7990daead5742373d9517758218c9",
                    requestBody
                )
                _suggestionState.value = _suggestionState.value.copy(
                    list = response.suggestions,
                    loading = false,
                    error = null
                )

            }catch (e: Exception){
                _suggestionState.value = _suggestionState.value.copy(
                    loading = false,
                    error = "Error fetching Suggestions: ${e.message}"
                )
            }
        }
    }

    data class SuggestionState(
        val loading: Boolean = true,
        val list: List<Suggestion> = emptyList(),
        val error: String? = null
    )
}