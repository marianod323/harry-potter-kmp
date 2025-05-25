package org.project.harry_potter.di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import org.project.harry_potter.data.PotterApi
import org.project.harry_potter.data.PotterApiImpl
import org.project.harry_potter.screens.list.CharacterListViewModel
import org.project.harry_potter.screens.list.SpellListViewModel
import org.project.harry_potter.screens.FavoriteHouseViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.project.harry_potter.data.PotterRepository
import org.project.harry_potter.data.PotterRepositoryImpl

expect fun platformModule(): Module

val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }

        HttpClient {
            install(ContentNegotiation) {
                json(json, contentType = ContentType.Any)
            }
        }
    }

    singleOf(::PotterApiImpl).bind(PotterApi::class)
    singleOf(::PotterRepositoryImpl).bind(PotterRepository::class)
}

val viewModelModule = module {
    viewModelOf(::CharacterListViewModel)
    viewModelOf(::FavoriteHouseViewModel)
    viewModelOf(::SpellListViewModel)
}

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            platformModule(),
            dataModule,
            viewModelModule
        )
    }
}