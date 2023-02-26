package com.barclays.practice.basic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hi");
        return "Hello all";
    }
}
