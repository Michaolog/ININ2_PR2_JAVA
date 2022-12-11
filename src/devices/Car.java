package devices;
public class Car extends Device{
    public Integer millage;
    public Integer value;

    public Car(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
    }


    public String toString(){
        return producer+" "+model+" "+yearOfProduction+" "+isOn+" "+color+" "+millage+" "+value;
    }

    @Override
    public void turnOn() {
        System.out.println("\nSamochód odpalony.");
        isOn = true;
    }
}
