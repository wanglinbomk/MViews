package com.example.helloworld.vm

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.helloworld.ContentEntity

class ItemViewModel : ViewModel() {

    fun onItemClick(view: View, item: Any) {
        Toast.makeText(view.context, (item as ContentEntity).content, Toast.LENGTH_SHORT).show()
    }

}