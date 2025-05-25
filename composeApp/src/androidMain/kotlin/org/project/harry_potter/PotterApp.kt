package org.project.harry_potter

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.project.harry_potter.di.initKoin

class PotterApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@PotterApp)
        }
    }
}