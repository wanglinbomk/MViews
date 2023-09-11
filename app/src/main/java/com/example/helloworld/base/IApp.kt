package com.example.helloworld.base

import android.app.Application

class IApp : Application() {

    companion object{
        private lateinit var instance: IApp
        @Synchronized
        @JvmStatic
        fun getInstance() : IApp{
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}