package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotations - built-in units of Spring code that make complex functionality
//readily available in Spring applications
@RestController
public class HelloController {
//method will be executed every time the app recieves a GET request to the /helloworld endpoint
  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello World!";
  }
}