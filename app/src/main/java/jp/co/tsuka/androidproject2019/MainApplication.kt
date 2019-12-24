package jp.co.tsuka.androidproject2019

import dagger.android.support.DaggerApplication
import jp.co.tsuka.androidproject2019.di.DaggerAppComponent

class MainApplication: DaggerApplication() {
    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()
}
