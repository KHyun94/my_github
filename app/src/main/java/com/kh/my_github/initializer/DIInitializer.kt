package com.kh.my_github.initializer

import android.content.Context
import androidx.startup.Initializer

/**
 * DI initializer
 * DI(Koin) 초기 설정
 */
@Suppress("USED_IN_MANIFEST")
class DIInitializer : Initializer<Unit> {
    override fun create(context: Context) {
//        startKoin {
////            androidContext(context)
////            modules(dataSourceModule)
////            modules(repositoryModule)
////            modules(viewModelModule)
//        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}