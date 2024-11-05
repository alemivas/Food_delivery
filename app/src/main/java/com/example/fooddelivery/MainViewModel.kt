package com.example.fooddelivery

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {
//    private val _repository: MainRepository = MainRepository()
//    private val _count = mutableStateOf(_repository.getCounter().count)
//
//    val count: MutableState<Int> = _count
//
//    fun increment (){
//        _repository.incrementCounter()
//        _count.value = _repository.getCounter().count
//    }
//
//    fun decrement (){
//        _repository.decrementCounter()
//        _count.value = _repository.getCounter().count
//    }

    var address by mutableStateOf("")

    fun updateAddress(value: String) {
        address = value
    }



    private val _categoryState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoryState

    init {
        fetchCategories()
    }

    private fun fetchCategories(){
        viewModelScope.launch {
            try {
//                val apiService = createRetrofit()
//                val requestBody = RequestBody("москва хабар")
                val requestBody = RequestBody("""{ "query": "москва хабар" }""")
                val response = recipeService.getCategories(
                    "application/json",
                    "application/json",
                    "Token d6a2ff4513b7990daead5742373d9517758218c9",
//                    "Token d6a2ff4513b7990daead5742373d9517758218c900",
//                    "москва хабар"//?????????????????
//                    "{\"query\": \"Москва Викт\"}"
//                    """{ "query": "москва хабар" }"""
                    requestBody
                )
                _categoryState.value = _categoryState.value.copy(
//                    list = response.categories,
                    list = emptyList(),
                    loading = false,
                    error = null
                )

            }catch (e: Exception){
                _categoryState.value = _categoryState.value.copy(
                    loading = false,
                    error = "Error fetching Categories ${e.message}"
                )
            }
        }
    }

    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}