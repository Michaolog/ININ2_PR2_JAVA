public class Car {
    final String producer;
    final String model;
    String color;
    Integer millage;
    Boolean isOn;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.isOn = true;
    }
}