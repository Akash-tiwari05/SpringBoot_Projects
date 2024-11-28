package org.example;

import java.beans.DesignMode;

public class DieselEngine implements IEngine{

    DieselEngine(){
        System.out.println("Diesel Engine Started....");
    }
    @Override
    public int start() {
        System.out.println("Desele");
        return 1;
    }
}
