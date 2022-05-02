package com.github.jianqibot.bloginkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogInKotlinApplication

fun main(args: Array<String>) {
    runApplication<BlogInKotlinApplication>(*args)
}
