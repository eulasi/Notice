package com.log.notice.formatter

import com.log.notice.LogLevel

interface MessageFormatter {
    fun format(level: LogLevel, message: String, throwable: Throwable?): String
}