package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helloworld.adapter.CommAdapter
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.vm.ItemViewModel

class MainActivity : ComponentActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mMainVm: MainVm
    private var adapter: CommAdapter<ContentEntity>? = null
    private var itemViewModel: ItemViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mMainVm = ViewModelProvider(this).get(MainVm::class.java)
        mBinding.mainVm = mMainVm
        mBinding.lifecycleOwner = this
        initObserve()
    }

    private fun initObserve() {
        mMainVm.getAllData().observe(this, Observer {
            if (adapter == null) {
                itemViewModel = ViewModelProvider(this).get(ItemViewModel::class.java)
                adapter = CommAdapter<ContentEntity>(
                    R.layout.item_main,
                    BR.contentEntity,
                    BR.itemViewModel,
                    itemViewModel!!,
                    it
                )
                mBinding.rvAll.layoutManager = LinearLayoutManager(this@MainActivity)
                mBinding.rvAll.adapter = adapter
            } else {
                adapter!!.refreshData(it)
            }
        })
    }
}

