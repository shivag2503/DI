package com.barclays.practice.basic.controllers;

import com.barclays.practice.basic.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String hello() {
        return greetingService.sayGreeting();
    }
}
