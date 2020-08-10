package ru.monitoringservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("monitoringservice.paths")
data class PathsConfig (
    var plc: String = "",
    var board: String= "",
    var server: String= "",
    var terminals: List<String> = listOf()
)