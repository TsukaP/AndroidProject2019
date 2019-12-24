package jp.co.tsuka.androidproject2019.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import jp.co.tsuka.androidproject2019.MainApplication
import jp.co.tsuka.androidproject2019.di.module.ActivityModule
import jp.co.tsuka.androidproject2019.di.module.AppModule
import jp.co.tsuka.androidproject2019.di.module.DataModule
import jp.co.tsuka.androidproject2019.di.module.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        DataModule::class,
        ActivityModule::class,
        ViewModelModule::class]
)
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MainApplication): Builder

        fun build(): AppComponent
    }

    override fun inject(application: MainApplication)
}
