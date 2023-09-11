package com.example.helloworld

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVm : ViewModel() {
    lateinit var data: MutableLiveData<MutableList<ContentEntity>>

    fun getAllData(): MutableLiveData<MutableList<ContentEntity>>{
        var temp = mutableListOf<ContentEntity>()
        temp.add(ContentEntity("One"))
        temp.add(ContentEntity("Two"))
        data = MutableLiveData(mutableListOf())
        data.value = temp
        return data
    }

}