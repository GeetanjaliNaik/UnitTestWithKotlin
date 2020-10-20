package com.geeta.unittestapp.app

import com.geeta.unittestapp.UnitTestApplication
import org.koin.core.module.Module

/**
 * Helps to configure required dependencies for Instru Tests.
 * Method provideDependency can be overrided and new dependencies can be supplied.
 */
class UnitTestAppTest : UnitTestApplication() {
    override fun provideDependency() = listOf<Module>()
}