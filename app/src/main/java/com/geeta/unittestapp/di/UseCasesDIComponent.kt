package com.geeta.unittestapp.di

import com.geeta.unittestapp.screens.login.LoginUseCase
import org.koin.dsl.module

/**
 * Use case DI module.
 * Provide Use case dependency.
 */
val UseCaseDependency = module {

    factory {
        LoginUseCase()
    }
}