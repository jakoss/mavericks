package com.airbnb.mvrx.todomvrx

import android.app.Application
import com.airbnb.mvrx.MvRx

class ToDoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MvRx.install(this)
    }
}