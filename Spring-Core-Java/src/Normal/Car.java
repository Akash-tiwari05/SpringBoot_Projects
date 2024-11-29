package Normal;

public class Car extends Engine {
    public void drive(){
        int start = super.start();
        if(start >=1){
            System.out.println("Engine Starting");
        }
        //IS A Relationship
    }
}
