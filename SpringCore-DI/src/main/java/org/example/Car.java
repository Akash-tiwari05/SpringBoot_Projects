package org.example;

public class Car {



    Car(){
        System.out.println("Car constructed...");

    }
    //constructor di
    Car(IEngine engine){
        this.engine = engine;
    }

    //target object
    IEngine engine;


    public void setEngine(IEngine engine) {

        this.engine = engine;
        System.out.println("Calling Setter method...");
    }

    void drive(){
        int start =  engine.start();
        if(start > 0){
            System.out.println("Car Started...");
        }else{
            System.out.println("Something is Wrong...");
        }
    }
}
