package org.project.harry_potter

import android.app.Application
import org.project.harry_potter.di.initKoin

class PotterApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}