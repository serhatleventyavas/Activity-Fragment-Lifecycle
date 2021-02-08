package com.monoli.activitylifecycleworkshop

import android.util.Log

object Logger {

    fun log(tag: String, message: String) {
        Log.i("Logger", "$tag -> $message")
    }
}