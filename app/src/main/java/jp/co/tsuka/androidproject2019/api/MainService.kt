package jp.co.tsuka.androidproject2019.api

import io.reactivex.Observable
import jp.co.tsuka.androidproject2019.api.model.CommonResponse
import retrofit2.Response
import retrofit2.http.POST

interface MainService {
    @POST("api/v1.0.0/auth/login")
    fun login(): Observable<Response<CommonResponse>>
}
