package jp.co.tsuka.androidproject2019.api.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * APIの共通ヘッダー
 */
class SecurityInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()
        // header設定
        val request: Request = original.newBuilder()
            .header("Content-Type", "application/json")
            .header("x-device-type", "android")
            .method(original.method(), original.body())
            .build()
        return chain.proceed(request)
    }
}
