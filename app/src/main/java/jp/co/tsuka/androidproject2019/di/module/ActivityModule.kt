package jp.co.tsuka.androidproject2019.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.co.tsuka.androidproject2019.di.module.ui.MainModule
import jp.co.tsuka.androidproject2019.ui.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(
        modules = [MainModule::class]
    )
    internal abstract fun mainActivity(): MainActivity
}
