package com.log.notice

import com.log.notice.formatter.SimpleMessageFormatter
import com.log.notice.logger.ConsoleLogger

object LoggerFactory {
    private var logger: Logger = ConsoleLogger(SimpleMessageFormatter())

    fun setLogger(customLogger: Logger) {
        logger = customLogger
    }

    fun getLogger(): Logger {
        return logger
    }
}
