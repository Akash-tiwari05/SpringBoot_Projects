package com.akash.SpringProject01.Beans;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements IEngine {

    Diesel(){
        System.out.println("Diesel Class Started");
    }

     public void start()
    {

        System.out.println("DIESEL Car Started......");
    }
}
