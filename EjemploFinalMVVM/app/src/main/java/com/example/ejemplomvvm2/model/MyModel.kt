package com.example.ejemplomvvm2.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyModel {
    private val _text = MutableLiveData<String>("Ejemplo MVVM realizado por:")
    val text: LiveData<String> = _text

    fun changeText() {
        _text.value = "Gabriela y Abigail"
    }
}
