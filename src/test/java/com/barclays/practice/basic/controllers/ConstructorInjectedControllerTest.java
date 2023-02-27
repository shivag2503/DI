package com.barclays.practice.basic.controllers;

import com.barclays.practice.basic.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(
                new GreetingServiceImpl());
    }

    @Test
    void hello() {
        System.out.println(constructorInjectedController.hello());
    }
}