package com.iron.hack.Lab3.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {

    public String whatTimeIsIT(){
        LocalTime hourNow = LocalTime.now();
        return hourNow.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

    public String whatDateIsToday(){
        LocalDate date = LocalDate.now();
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String whatDayIsToday(){
        LocalDate day = LocalDate.now();
        DayOfWeek weekDay = day.getDayOfWeek();
        return weekDay.name();
    }
}
