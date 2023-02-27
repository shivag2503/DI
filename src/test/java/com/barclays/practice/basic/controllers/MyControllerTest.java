package com.barclays.practice.basic.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void hello() {

        MyController myController = new MyController();
        System.out.println(myController.hello());
    }
}