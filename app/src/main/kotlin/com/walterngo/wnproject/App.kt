package com.walterngo.wnproject

import com.walterngo.wnproject.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return AndroidInjector {
            DaggerAppComponent.builder().application(this).build().inject(this)
        }
    }
}