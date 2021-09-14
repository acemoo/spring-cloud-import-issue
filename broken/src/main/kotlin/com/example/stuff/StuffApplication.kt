package com.example.stuff

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@SpringBootApplication
class StuffApplication

fun main(args: Array<String>) {
    runApplication<StuffApplication>(*args)
}

@Component
class Runner(private val env: Environment): CommandLineRunner {
    override fun run(vararg args: String?) {
        println("breakpoint")
    }
}
