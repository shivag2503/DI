package com.barclays.practice.basic.controllers;

import com.barclays.practice.basic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;


    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("jfkfjkdkdjkghdj");
    }

    public String hello() {
        return greetingService.sayGreeting();
    }
}
