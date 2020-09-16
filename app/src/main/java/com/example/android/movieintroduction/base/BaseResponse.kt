package com.example.android.movieintroduction.base

import com.example.android.movieintroduction.Status

data class BaseResponse<T>(
    var result: T? = null,
    var error: Exception? = null,
    var status: Status
) {
    companion object {
        fun <T> success(data: T) =
            BaseResponse(
                data,
                null,
                Status.SUCCESS
            )
        fun <T> error(error: Exception, data: T?) =
            BaseResponse(
                data,
                error,
                Status.ERROR
            )
        fun <T> loading(data: T?) =
            BaseResponse(
                data,
                null,
                Status.LOADING
            )
    }
}
