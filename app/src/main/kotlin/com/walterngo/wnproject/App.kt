package com.walterngo.wnproject

import com.walterngo.wnproject.injection.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return AndroidInjector {
            DaggerAppComponent.builder()
                    .application(this)
                    .build()
                    .inject(this)
        }
    }
}