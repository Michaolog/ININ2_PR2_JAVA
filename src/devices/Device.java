package devices;
import interfaces.salleable;

public abstract class Device implements salleable {
    final String producer;
    final String model;
    public Integer yearOfProduction;
    Boolean isOn;
    public String color;

    public Double value;

    public Device(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
        this.isOn = false;
    }

    public String toString(){
        return producer+" "+model+" "+yearOfProduction+" "+isOn+" "+color;
    }

    public abstract void turnOn();
}
