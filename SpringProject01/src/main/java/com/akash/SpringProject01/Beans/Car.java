package com.akash.SpringProject01.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {


    @Autowired
    IEngine engine;



    public void m1(){

        engine.start();
    }

}
