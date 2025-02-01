package com.dawid.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppStarter

fun main(args: Array<String>) {
    runApplication<AppStarter>(*args)
}
