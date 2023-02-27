package com.barclays.practice.basic.services.i18n;

import com.barclays.practice.basic.controllers.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class EnglishGreetingServiceTest {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayGreeting() {
        System.out.println(myi18NController.hello());
    }
}