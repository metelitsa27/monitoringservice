package ru.monitoringservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MonitoringServiceApp {
}

fun main(args: Array<String>) {
    SpringApplication.run(MonitoringServiceApp::class.java, *args)
}