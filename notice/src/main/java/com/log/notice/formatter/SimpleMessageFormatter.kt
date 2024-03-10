package com.log.notice.formatter

import com.log.notice.LogLevel

internal class SimpleMessageFormatter : MessageFormatter {
    override fun format(level: LogLevel, message: String, throwable: Throwable?): String {
        val formattedMessage = "[${level.name}] $message"
        return throwable?.let { "$formattedMessage\n${it.stackTraceToString()}" } ?: formattedMessage
    }
}