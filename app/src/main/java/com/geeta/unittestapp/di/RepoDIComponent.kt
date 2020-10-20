package com.geeta.unittestapp.di

import com.geeta.unittestapp.repository.LoginRepository
import org.koin.dsl.module

/**
 * Repository DI module.
 * Provides Repo dependency.
 */
val RepoDependency = module {

    factory {
        LoginRepository()
    }

}