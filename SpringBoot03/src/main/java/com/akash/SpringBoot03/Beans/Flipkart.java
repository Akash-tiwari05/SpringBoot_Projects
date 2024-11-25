package com.akash.SpringBoot03.Beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {


    @Autowired
    //@Qualifier("jusPay")
    Partners pet;

    @Value("${jdbc.url}")
    private String url;

    Flipkart()
    {
        System.out.println("Flipcart Construct ...");
    }


    public void paymentGateWay(String Amount)
    {
        System.out.println(url);
     pet.Payment(Amount);
    }
}
