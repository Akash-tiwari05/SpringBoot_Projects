package Com.Akash.springdemo.Loosecouple;

public class PetrolEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
