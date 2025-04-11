package com.iron.hack.Lab3.controller;

import com.iron.hack.Lab3.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class TimeController {

    private TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String hour() {
        return timeService.whatTimeIsIT();
    }

    @GetMapping("/date")
    public String date() {
        return timeService.whatDateIsToday();
    }

    @GetMapping("/day")
    public String day() {
        return timeService.whatDayIsToday();
    }

    @GetMapping("/all")
    public Map<String, Object> getAll() {
        Map<String, Object> time = new HashMap<>();
        time.put("time", timeService.whatTimeIsIT());
        time.put("date",timeService.whatDateIsToday());
        time.put("day",timeService.whatDayIsToday());
        return time;
    }
}