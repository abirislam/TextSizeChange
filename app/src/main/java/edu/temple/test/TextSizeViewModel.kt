package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextSizeViewModel : ViewModel() {
    private val textSize : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun getText() : LiveData<Int> {
        return textSize
    }

    fun setText(size: Int) {
        textSize.value = size
    }


}