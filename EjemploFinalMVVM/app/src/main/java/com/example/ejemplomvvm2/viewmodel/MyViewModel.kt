package com.example.ejemplomvvm2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ejemplomvvm2.model.MyModel

class MyViewModel : ViewModel() {
    private val model = MyModel()

    fun getText() = model.text

    fun changeText() {
        model.changeText()
    }
}
