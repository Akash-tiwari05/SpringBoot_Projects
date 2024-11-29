package Com.Akash.springdemo.Loosecouple;

public class EngineFactory {
    public IEngine getInstance(String engineName){
        if(engineName.equals("Petrol")){
            return new PetrolEngine();
        }else{
            return (IEngine) new DesilEngine();
        }
    }
}
