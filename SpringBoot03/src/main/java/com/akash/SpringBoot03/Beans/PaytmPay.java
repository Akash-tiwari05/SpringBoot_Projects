package com.akash.SpringBoot03.Beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class PaytmPay implements Partners{

    PaytmPay(){
        System.out.println("Paytm Construct ....");
    }

    @Override
    public void Payment(String Amount) {
        System.out.println("PaymentPay Payment Done For = " + Amount);

    }
}
