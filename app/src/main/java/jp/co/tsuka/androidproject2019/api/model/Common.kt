package jp.co.tsuka.androidproject2019.api.model

/**
 * 汎用エラー
 */
data class CommonError(
    val status: String,
    val errorCode: String,
    val message: String,
    val errorList: List<ErrorItem>
)

data class ErrorItem(
    val objects: String,
    val field: String,
    val rejectedValue: String,
    val message: String
)

/**
 * 汎用レスポンス
 */
data class CommonResponse(
    val message: String,
    val success: Boolean
)
