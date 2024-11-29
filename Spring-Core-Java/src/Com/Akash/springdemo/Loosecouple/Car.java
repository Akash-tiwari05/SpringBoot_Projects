package Com.Akash.springdemo.Loosecouple;



public class Car  {
    IEngine enginee;
    Car(IEngine engine){
        this.enginee = engine;
    }
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
