package com.akash.SpringBoot03.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class JusPay implements Partners{

    JusPay(){
        System.out.println("JusPay Construct...");
    }

    @Override
    public void Payment(String Amount) {
        System.out.println("JusPay Payment Done For = " + Amount);
    }
}
