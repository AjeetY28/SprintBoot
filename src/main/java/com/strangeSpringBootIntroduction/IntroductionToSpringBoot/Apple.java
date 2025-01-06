package com.strangeSpringBootIntroduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    void eatApple()
    {
        System.out.println("I am eating the apple");
    }


    @PostConstruct
    void callThisBeforeAppleUsed()
    {
        System.out.println("Creating the apple before the used");
    }

    @PreDestroy
    void callThisBeforeDestroy()
    {

        System.out.println("Destroying the Bean");
    }
}
