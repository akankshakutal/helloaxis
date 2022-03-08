package com.helloaxis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloAxisApplication

fun main(args: Array<String>) {
	runApplication<HelloAxisApplication>(*args)
}
