package com.pujh.jsbridge

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION)
annotation class JsMethod(
    val callback: Boolean,
    val description: String = ""
)
