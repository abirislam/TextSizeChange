package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextSizeViewModel : ViewModel() {
    private val textSize : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }

    fun getText() : LiveData<Float> {
        return textSize
    }

    fun setText(size: Float) {
        textSize.value = size
    }
}