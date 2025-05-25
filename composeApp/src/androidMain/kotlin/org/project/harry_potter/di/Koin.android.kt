package org.project.harry_potter.di

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import kotlinx.coroutines.Dispatchers
import org.project.harry_potter.data.database.PotterDatabase
import org.koin.dsl.module

actual fun platformModule() = module {
    single<PotterDatabase> { getDatabaseBuilder(get()) }
}

fun getDatabaseBuilder(ctx: Context): PotterDatabase {
    val dbFile = ctx.getDatabasePath("room.db")
    return Room.databaseBuilder<PotterDatabase>(ctx, dbFile.absolutePath)
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}