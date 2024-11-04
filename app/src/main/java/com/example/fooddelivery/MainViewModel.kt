package com.example.fooddelivery

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

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
}