package com.barclays.practice.basic.controllers;

import com.barclays.practice.basic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String hello() {
        return greetingService.sayGreeting();
    }
}
