package com.zup.appkoin

import android.app.Application
import com.zup.appkoin.di.appModule
import com.zup.appkoin.di.repositoryModule
import com.zup.appkoin.di.viewModelModule
import com.zup.appkoin.view.util.ConnectivityReceiver
import com.zup.appkoin.view.util.ConnectivityReceiver.ConnectivityReceiverListener
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


/**
 * classe onde sera inicializado koin
 */

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext ( this@MyApplication)
            modules(listOf(repositoryModule, viewModelModule, appModule))
        }

    }

}