package com.example.fooddelivery

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {
    var address by mutableStateOf("")
    fun updateAddress(value: String) {
        address = value
    }

    private val _suggestionState = mutableStateOf(SuggestionState())
    val suggestionsState: State<SuggestionState> = _suggestionState

    init {
        fetchSuggestions()
    }

    private fun fetchSuggestions(){
        viewModelScope.launch {
            try {
//                val requestBody = RequestBody("Ижевск лен")
                val requestBody = RequestBody("""{ "query": "Ижевск лен" }""")
                val response = recipeService.getSuggestions(
                    "application/json",
                    "application/json",
                    "Token d6a2ff4513b7990daead5742373d9517758218c9",
                    requestBody
                )
                _suggestionState.value = _suggestionState.value.copy(
                    list = response.suggestions,
//                    list = emptyList(),
                    loading = false,
                    error = null
                )

            }catch (e: Exception){
                _suggestionState.value = _suggestionState.value.copy(
                    loading = false,
                    error = "Error fetching Suggestions ${e.message}"
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