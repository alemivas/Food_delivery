package com.example.fooddelivery.Model

data class Suggestion(
    val value: String
)

data class SuggestionResponse(
    val suggestions: List<Suggestion>
)