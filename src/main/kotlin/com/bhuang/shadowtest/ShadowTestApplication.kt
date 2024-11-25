package com.bhuang.shadowtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class ShadowTestApplication

fun main(args: Array<String>) {
    runApplication<ShadowTestApplication>(*args)
}
