package jp.co.tsuka.androidproject2019.api

import io.reactivex.Observable
import jp.co.tsuka.androidproject2019.api.model.CommonResponse
import retrofit2.Response

class MainRepository(private val mainService: MainService) {
    fun login(): Observable<Response<CommonResponse>> {
        return mainService.login()
    }
}
