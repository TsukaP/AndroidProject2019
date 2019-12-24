package jp.co.tsuka.androidproject2019.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import jp.co.tsuka.androidproject2019.MainApplication
import javax.inject.Singleton

@Module
internal object AppModule {

    @Provides
    @Singleton
    @JvmStatic
    fun provideApplication(application: MainApplication): Context = application
}
