package com.example.helloworld.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.vm.ItemViewModel

class CommAdapter<T>(
    private val layoutId: Int,
    private val variableId: Int,
    private val clickId: Int,
    private val clickViewModel: ItemViewModel,
    private val itemList: MutableList<T>
) : RecyclerView.Adapter<CommAdapter<T>.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutId, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    fun refreshData(newData: MutableList<T>) {
        itemList.clear()
        itemList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: T) {
            binding.setVariable(variableId, item)
            binding.setVariable(clickId, clickViewModel)
            binding.executePendingBindings()
        }
    }

}