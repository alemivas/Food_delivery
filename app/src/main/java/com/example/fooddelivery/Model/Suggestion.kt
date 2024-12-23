package com.example.fooddelivery.Model

data class Suggestion(
    val value: String,
    val data: Data
)

data class Data(
    val street_type: String,
    val street: String,
    val house_type: String,
    val house: String,
    val block_type: String,
    val block: String,
    val settlement_type: String,
    val settlement: String,
    val city_type: String,
    val city: String,
    val area_type: String,
    val area: String,
    val region_type: String,
    val region: String,
    val country: String,
)

data class SuggestionResponse(
    val suggestions: List<Suggestion>
)