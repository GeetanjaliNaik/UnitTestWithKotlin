package com.geeta.unittestapp.app

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import com.dev.ccodetest.app.UnitTestAppTest

/**
 * Custom Instrumentation Test runner.
 * Helps to configure environment with new App instance.
 */
class CustomInstrumentationRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader,
                                className: String,
                                context: Context): Application {
        return super.newApplication(cl,
            UnitTestAppTest::class.java.name,
            context)
    }
}