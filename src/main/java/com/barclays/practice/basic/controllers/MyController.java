package com.barclays.practice.basic.controllers;

import com.barclays.practice.basic.services.GreetingService;
import com.barclays.practice.basic.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hello() {
        System.out.println("Hi");
        return greetingService.sayGreeting();
    }
}
