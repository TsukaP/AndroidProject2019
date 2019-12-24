package jp.co.tsuka.androidproject2019.di.module

import dagger.Module
import dagger.Provides
import jp.co.tsuka.androidproject2019.api.MainRepository
import jp.co.tsuka.androidproject2019.api.MainService
import javax.inject.Singleton

@Module
internal object RepositoryModule {
    @Provides
    @Singleton
    @JvmStatic
    fun provideMainRepository(mainService: MainService): MainRepository {
        return MainRepository(mainService)
    }
}
