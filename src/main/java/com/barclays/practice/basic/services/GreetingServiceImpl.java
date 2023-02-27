package com.barclays.practice.basic.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}
