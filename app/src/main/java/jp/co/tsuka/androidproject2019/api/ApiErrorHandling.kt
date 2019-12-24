package jp.co.tsuka.androidproject2019.api

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import jp.co.tsuka.androidproject2019.api.model.CommonError
import org.json.JSONException
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException

class ApiErrorHandling {
    companion object {
        fun getError(throwable: Throwable): CommonError {
            return when (throwable) {
                is HttpException -> try {
                    Gson().fromJson(
                        throwable.response().errorBody()?.charStream(),
                        CommonError::class.java
                    )
                } catch (e: JSONException) {
                    // JSON構成不正エラー
                    CommonError("", "400", "JSON構成不正エラー", emptyList())
                } catch (e: JsonSyntaxException) {
                    // JSON構成不正エラー
                    CommonError("", "400", "JSON構成不正エラー", emptyList())
                }
                is IOException -> {
                    // ネットワークエラー
                    CommonError("", "400", "ネットワークエラー", emptyList())
                }
                is SocketTimeoutException -> {
                    // タイムアウト
                    CommonError("", "400", "タイムアウト", emptyList())
                }
                else -> {
                    // その他エラー
                    CommonError("", "400", "その他エラー", emptyList())
                }
            }
        }
    }
}
