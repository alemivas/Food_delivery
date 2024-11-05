package com.example.fooddelivery

data class Suggestion(
    val value: String
)

data class SuggestionResponse(
    val suggestions: List<Suggestion>
)