package DepencyInjection;

import Com.Akash.springdemo.Loosecouple.PetrolEngine;

import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        /*CArDI car1 = new CArDI(); // same as constructor dependency injection
        car1.setEnginee(new PetrolEngine());// setter dependency injection
        car1.drive();*/


        //field Injection
       // Reflection API

     Class<?> aclass = Class.forName("DepencyInjection.CArDI");
        Field field = aclass.getDeclaredField("enginee");
        field.setAccessible(true);

        Object instance  = aclass.newInstance();
        CArDI carDI = new CArDI();



        field.set(carDI,new PetrolEngine());
        carDI.drive();
    }
}
