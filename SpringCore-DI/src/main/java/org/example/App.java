package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        //manual enter
        /*Pe = new PetrolEngine();  
        Car car = new Car();
        car.setEngine(petrolEngine);*/

        //through ioc

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car car1 = context.getBean(Car.class);


        car1.drive();
    }
}
