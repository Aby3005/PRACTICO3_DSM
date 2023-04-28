package com.example.ejemplomvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text

    init {
        _text.value = "Ejemplo MVVM realizado por:"
    }

    fun onUpdateClicked() {
        GlobalScope.launch {
            delay(1000)
            _text.postValue("Gabriela y Abigail!")
        }
    }
}
