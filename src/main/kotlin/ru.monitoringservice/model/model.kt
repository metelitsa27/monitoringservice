package ru.monitoringservice.model

import java.time.LocalDateTime

data class SystemActivity(
        val plcActivity: ServiceActivity,
        val boardActivity: ServiceActivity,
        val serverActivity: ServiceActivity,
        val workPlaces: List<WorkPlaceState>
)

data class WorkPlaceState(
        val id: Int,
        val pult: DeviceActivity?,
        val tractionController: DeviceActivity?,
        val terminal1: DeviceActivity?,
        val terminal2: DeviceActivity?
)

data class DeviceActivity(
        val id: Int,
        override val isActive: Boolean,
        override val lastActivity: LocalDateTime?
): Activity(isActive, lastActivity)

data class ServiceActivity(
        override val isActive: Boolean,
        override val lastActivity: LocalDateTime?
): Activity(isActive, lastActivity)

open class Activity(
       open val isActive: Boolean,
       open val lastActivity: LocalDateTime?
)