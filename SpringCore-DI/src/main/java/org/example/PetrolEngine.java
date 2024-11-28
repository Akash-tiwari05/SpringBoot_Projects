package org.example;

public class PetrolEngine implements IEngine{

    PetrolEngine(){
        System.out.println("Petrol engine constructed...");
    }
    @Override
    public int start() {
        return 1;
    }
}
