package DepencyInjection;


import Com.Akash.springdemo.Loosecouple.IEngine;

public class CArDI {
    private IEngine enginee;
   /* public void setEnginee(IEngine enginee) {
        this.enginee = enginee; // setter di
    }
*/


    
    public void drive(){
        int start = enginee.start();
        if(start >=1){
            System.out.println("Engine Started.....");
        }
        else
        {
            System.out.println("Engine In Troble...");
        }
    }
}
