package com.log.notice

interface Logger {
    fun log(level: LogLevel, message: String, throwable: Throwable? = null)
    fun debug(message: String)
    fun info(message: String)
    fun warn(message: String)
    fun error(message: String, throwable: Throwable? = null)
    fun fatal(message: String)
}