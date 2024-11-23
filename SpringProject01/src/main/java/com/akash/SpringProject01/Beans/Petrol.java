package com.akash.SpringProject01.Beans;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements IEngine {

    Petrol(){
        System.out.println("Petrol Class Started");
    }
    public void start()
    {
        System.out.println("Petrol Car Started......");
    }
}
