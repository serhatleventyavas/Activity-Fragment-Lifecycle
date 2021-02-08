package com.monoli.activitylifecycleworkshop

import android.app.Application

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Logger.log("CustomApplication", "Application OnCreate")
    }
}