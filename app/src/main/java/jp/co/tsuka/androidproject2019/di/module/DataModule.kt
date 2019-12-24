package jp.co.tsuka.androidproject2019.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import jp.co.tsuka.androidproject2019.BuildConfig
import jp.co.tsuka.androidproject2019.BuildConfig.BASE_URL
import jp.co.tsuka.androidproject2019.api.MainService
import jp.co.tsuka.androidproject2019.api.interceptor.SecurityInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module(includes = [(RepositoryModule::class)])
internal object DataModule {
    @Singleton
    @Provides
    @JvmStatic
    internal fun provideGson(): Gson {
        return GsonBuilder()
            .setLenient()
            .create()
    }

    @Singleton
    @Provides
    @JvmStatic
    internal fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder().apply {
            connectTimeout(20, TimeUnit.SECONDS)
            readTimeout(20, TimeUnit.SECONDS)
            addInterceptor(SecurityInterceptor())
            if (BuildConfig.DEBUG) addInterceptor(
                HttpLoggingInterceptor().setLevel(
                    HttpLoggingInterceptor.Level.BODY
                )
            )
        }.build()
    }

    @Singleton
    @Provides
    @JvmStatic
    internal fun provideRetrofitInterface(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    @JvmStatic
    internal fun provideMemmaService(retrofit: Retrofit): MainService {
        return retrofit.create(MainService::class.java)
    }
}
