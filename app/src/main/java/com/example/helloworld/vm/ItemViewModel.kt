package com.example.helloworld.vm

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.helloworld.ContentEntity

class ItemViewModel : ViewModel() {
     var currentData : MutableLiveData<ContentEntity>?= null

    init {
        currentData = MutableLiveData()
    }
    fun onItemClick(view: View, item: Any) {
        currentData!!.value = item as ContentEntity
    }
}