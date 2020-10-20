package com.geeta.unittestapp.di

import com.geeta.unittestapp.platform.SharedPreferenceHelper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Shared Preference DI Module.
 *
 */
val SharedPrefDependency = module {

    factory { SharedPreferenceHelper(androidContext()) }
}