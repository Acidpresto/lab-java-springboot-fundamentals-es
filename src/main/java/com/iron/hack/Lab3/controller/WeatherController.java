package com.iron.hack.Lab3.controller;

import com.iron.hack.Lab3.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public double getTemp() {
        return weatherService.obtainTemp();
    }

    @GetMapping("/condition")
    public String condition(){
        return weatherService.obtainWeather();
    }

    @GetMapping("/wind")
    public double getSpeed(){
        return weatherService.windSpeed();
    }
    @GetMapping("/all")
    public Map<String, Object>getAll(){
      Map <String, Object> weather = new HashMap<>();
      weather.put("temperature",weatherService.obtainTemp());
      weather.put("condition",weatherService.obtainWeather());
      weather.put("wind speed", weatherService.windSpeed());
      return weather;
    }
}