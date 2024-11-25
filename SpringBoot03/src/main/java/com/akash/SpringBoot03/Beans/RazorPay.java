package com.akash.SpringBoot03.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RazorPay implements Partners{

    RazorPay(){
        System.out.println("Razorpay Construct ....");
    }

    @Override
    public void Payment(String Amount) {
        System.out.println("RazorPay Payment Done For = " + Amount);

    }
}
