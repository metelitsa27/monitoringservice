package ru.monitoringservice

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import ru.monitoringservice.config.PathsConfig
import ru.monitoringservice.model.DeviceActivity
import ru.monitoringservice.model.ServiceActivity
import ru.monitoringservice.model.SystemActivity
import ru.monitoringservice.model.WorkPlaceState
import java.time.LocalDateTime
import java.time.ZoneOffset


@RestController
class MainController{
    private var resultActivity: SystemActivity? = null

    init{
        //todo: test init - remove it later
        resultActivity = SystemActivity(
                plcActivity = ServiceActivity(
                     true,
                        LocalDateTime.now(ZoneOffset.UTC)
                ),
                boardActivity = ServiceActivity(
                        true,
                        LocalDateTime.now(ZoneOffset.UTC)
                ),
                serverActivity = ServiceActivity(
                        true,
                        LocalDateTime.now(ZoneOffset.UTC)
                ),
                workPlaces = listOf(
                        WorkPlaceState(
                                1,
                                DeviceActivity(11, false, LocalDateTime.now(ZoneOffset.UTC)),
                                DeviceActivity(12, false, LocalDateTime.now(ZoneOffset.UTC)),
                                DeviceActivity(13, false, LocalDateTime.now(ZoneOffset.UTC)),
                                DeviceActivity(14, false, LocalDateTime.now(ZoneOffset.UTC))
                        )
                )
        )
    }

    // todo: add update activity state

    @GetMapping("/systemActivity")
    fun getActivity(): SystemActivity? = resultActivity

    // todo: add post mapping func
}