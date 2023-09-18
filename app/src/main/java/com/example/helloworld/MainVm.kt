package com.example.helloworld

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVm : ViewModel() {
    lateinit var data: MutableLiveData<MutableList<ContentEntity>>

    fun getAllData(): MutableLiveData<MutableList<ContentEntity>>{
        var temp = mutableListOf<ContentEntity>()
        temp.add(ContentEntity("drawColor"))
        temp.add(ContentEntity("drawCircle"))
        temp.add(ContentEntity("drawRect"))
        temp.add(ContentEntity("drawPoint"))
        temp.add(ContentEntity("drawOval"))
        temp.add(ContentEntity("drawLine"))
        temp.add(ContentEntity("drawRoundRect"))
        temp.add(ContentEntity("drawArc"))
        temp.add(ContentEntity("drawPath"))
        temp.add(ContentEntity("直方图"))
        temp.add(ContentEntity("饼图"))
        data = MutableLiveData(mutableListOf())
        data.value = temp
        return data
    }

}