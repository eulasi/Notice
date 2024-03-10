package com.log.notice.logger

import com.log.notice.LogLevel
import com.log.notice.Logger
import com.log.notice.formatter.MessageFormatter

class ConsoleLogger(private val formatter: MessageFormatter) : Logger {

    override fun log(level: LogLevel, message: String, throwable: Throwable?) {
        println(formatter.format(level, message, throwable))
    }

    override fun debug(message: String) {
        log(LogLevel.DEBUG, message)
    }

    override fun info(message: String) {
        log(LogLevel.INFO, message)
    }

    override fun warn(message: String) {
        log(LogLevel.WARN, message)
    }

    override fun error(message: String, throwable: Throwable?) {
        log(LogLevel.ERROR, message, throwable)
    }

    override fun fatal(message: String) {
        log(LogLevel.FATAL, message)
    }
}