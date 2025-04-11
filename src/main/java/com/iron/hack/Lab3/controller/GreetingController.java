package com.iron.hack.Lab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String name() {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String name (@PathVariable String name){
        return "Hello " + name ;
    }

    @GetMapping("/add/{num1}/{num2}")
    public int add (@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }
}
