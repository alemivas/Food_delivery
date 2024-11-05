package com.example.fooddelivery

data class Category(
//    val idCategory:String,
//    val strCategory:String,
//    val strCategoryThumb: String,
//    val strCategoryDescription: String
    val value: String
)

data class CategoryResponse(
    val categories: List<Category>
)

//data class RequestBody(
//    val query: String
//)