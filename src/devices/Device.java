package devices;
import interfaces.salleable;

public abstract class Device implements salleable {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Boolean isOn;
    public String color;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isOn = false;
    }

    public String toString(){
        return producer+" "+model+" "+yearOfProduction+" "+isOn+" "+color;
    }

    public abstract void turnOn();
}
