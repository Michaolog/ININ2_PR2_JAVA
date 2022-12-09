package devices;
public class Phone {
    String producer;
    String model;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String toString(){
        return producer+" "+model;
    }
}
