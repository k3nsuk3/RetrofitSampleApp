package link.k3n.retrofitsampleapp

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import link.k3n.retrofitsampleapp.utils.CustomDebugTree
import timber.log.Timber

/**
 * Application class
 */
class RetrofitSampleApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(CustomDebugTree())
    }
}