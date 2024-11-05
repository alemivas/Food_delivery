package com.example.fooddelivery.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

private val retrofit = Retrofit.Builder()
    .baseUrl("https://suggestions.dadata.ru/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestions(
        @Header("Content-Type") contentType: String,
        @Header("Accept") accept: String,
        @Header("Authorization") authorization: String,
        @Body requestBody: RequestBody
    ): SuggestionResponse
}

data class RequestBody(val query: String)