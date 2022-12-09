package devices;
public class Car {
    final String producer;
    final String model;
    public String color;
    public Integer millage;
    Boolean isOn;
    public Integer Value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.isOn = true;
    }

    public String toString(){
        return producer+" "+model+" "+color+" "+millage+" "+isOn+" "+Value;
    }
}
