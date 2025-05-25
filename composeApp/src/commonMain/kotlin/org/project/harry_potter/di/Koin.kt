package org.project.harry_potter.di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module
import org.project.harry_potter.data.PotterApi
import org.project.harry_potter.data.PotterApiImpl
import org.koin.core.context.startKoin
import org.project.harry_potter.data.PotterRepository

val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }

        HttpClient {
            install(ContentNegotiation) {
                json(json, contentType = ContentType.Any)
            }
        }
    }

    single<PotterApi> {
        PotterApiImpl(get())
    }

    single {
        PotterRepository(get())
    }
}

fun initKoin() {
    startKoin {
        modules(
            dataModule
        )
    }
}