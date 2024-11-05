package com.example.fooddelivery

//import okhttp3.RequestBody
//import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST


//private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
private val retrofit = Retrofit.Builder()
    .baseUrl("https://suggestions.dadata.ru/")
//    .baseUrl("https://suggestionsdfdg.dadata.ru/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)


//interface ApiService{
//    @GET("categories.php")
//    suspend fun getCategories():CategoryResponse
//}
interface ApiService {
//    @POST("suggestions/api/4_1/rs/suggest/address")
//    suspend fun getCategories/*getSuggestions*/(
//        @Header("Content-Type") contentType: String,
//        @Header("Accept") accept: String,
//        @Header("Authorization") authorization: String,
////        @Body requestBody: String//??????????????????????????
//        @Body requestBody: RequestBody
//    ): CategoryResponse/*Call<ResponseBody>*/
    @POST("suggestions/api/4_1/rs/suggest/address")
    suspend fun getCategories/*getSuggestions*/(
        @Header("Content-Type") contentType: String,
        @Header("Accept") accept: String,
        @Header("Authorization") authorization: String,
        @Body requestBody: RequestBody
    ): CategoryResponse/*Call<ResponseBody>*/
}

data class RequestBody(val query: String)
//data class ResponseBody(val suggestions: List<Suggestion>)

data class Suggestion(val value: String, val unrestricted_value: String)