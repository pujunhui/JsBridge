package com.pujh.jsbridge

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class JsApi(
    val version: Int,
    val description: String = ""
)
