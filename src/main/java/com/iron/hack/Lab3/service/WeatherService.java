package com.iron.hack.Lab3.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Service
public class WeatherService {
private Random random;

public WeatherService(){
    random = new Random();
}

public double obtainTemp(){
    //nextDouble generate a number between 0,0 and 1,0
    double temperature = -10 + 50 * random.nextDouble();
    BigDecimal temp = new BigDecimal(temperature).setScale(2, RoundingMode.HALF_UP);
    return temp.doubleValue();
}

public String obtainWeather (){
    String[] condition = {"Sunny", "Rainy", "Cloudy", "Windy"};
    int index = random.nextInt(condition.length);
    return condition[index];
}

public double windSpeed(){
    double speed = 100 * random.nextDouble();
    BigDecimal speed2 = new BigDecimal(speed).setScale(2,RoundingMode.HALF_UP);
    return speed2.doubleValue();
}

}
