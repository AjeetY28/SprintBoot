package com.strangeSpringBootIntroduction.IntroductionToSpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env" ,havingValue = "production")
public class ProdDb implements DB{
    public String getData()
    {
        return "Prod Data";
    }
}

