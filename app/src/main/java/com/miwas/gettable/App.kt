package com.miwas.gettable

import android.app.Application
import com.miwas.gettable.data.database.GetTableDatabase
import com.miwas.gettable.data.repository.DatabaseRepository

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        database = GetTableDatabase.getInstance(applicationContext)
        databaseRepository = DatabaseRepository(database)

    }

    companion object {
        lateinit var database: GetTableDatabase
            private set

        lateinit var databaseRepository: DatabaseRepository
            private set
    }

}