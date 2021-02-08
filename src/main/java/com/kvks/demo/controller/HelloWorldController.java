package com.kvks.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

   @GetMapping(value = "/hello-world")
    public String sayGreeting(){

       return "Hello World!";

    }
}
