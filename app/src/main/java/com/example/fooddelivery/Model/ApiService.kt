package com.example.fooddelivery.Model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

private val interceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
//    level = HttpLoggingInterceptor.Level.HEADERS
}

private val okHttpClient = OkHttpClient.Builder()
    .addInterceptor(interceptor)
    .build()

private val retrofit = Retrofit.Builder()
    .baseUrl("https://suggestions.dadata.ru/")
//    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .client(okHttpClient)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val suggestionService = retrofit.create(ApiService::class.java)

interface ApiService {
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getSuggestions(
        @Header("Content-Type") contentType: String,
        @Header("Accept") accept: String,
        @Header("Authorization") authorization: String,
        @Body requestBody: RequestBody
    ): SuggestionResponse
}
//interface ApiService {
//    @GET("categories.php")
//    suspend fun getSuggestions():SuggestionResponse
//}

data class RequestBody(val query: String)