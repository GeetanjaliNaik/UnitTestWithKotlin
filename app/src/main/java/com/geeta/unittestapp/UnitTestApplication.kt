package com.geeta.unittestapp

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.geeta.unittestapp.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class UnitTestApplication: MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        initiateKoin()
    }

    private fun initiateKoin() {
        startKoin{
            androidContext(this@UnitTestApplication)
            modules(provideDependency())
        }
    }

    open fun provideDependency() = appComponent
}