package chen.example.lee.jppractice

import android.app.Application
import chen.example.lee.jppractice.feature.home.di.home_module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JPPracticeApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JPPracticeApp)
            modules(
                home_module
            )
        }
    }
}