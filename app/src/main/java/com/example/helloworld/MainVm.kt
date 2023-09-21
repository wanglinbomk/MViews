package com.example.helloworld

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVm : ViewModel() {
    lateinit var data: MutableLiveData<MutableList<ContentEntity>>
    fun getAllData(): MutableLiveData<MutableList<ContentEntity>> {
        var temp = mutableListOf<ContentEntity>()
        temp.add(ContentEntity(0, "drawColor"))
        temp.add(ContentEntity(1, "drawCircle"))
        temp.add(ContentEntity(2, "drawRect"))
        temp.add(ContentEntity(3, "drawPoint"))
        temp.add(ContentEntity(4, "drawOval"))
        temp.add(ContentEntity(5, "drawLine"))
        temp.add(ContentEntity(6, "drawRoundRect"))
        temp.add(ContentEntity(7, "drawArc"))
        temp.add(ContentEntity(8, "drawPath"))
        temp.add(ContentEntity(9, "直方图"))
        temp.add(ContentEntity(10, "饼图"))
        data = MutableLiveData(mutableListOf())
        data.value = temp
        return data
    }

}