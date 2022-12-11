package devices;
public class Phone extends Device {
    final Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    public String toString(){
        return producer+" "+model+" "+yearOfProduction+" "+isOn+" "+color+" "+" "+screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("\nTelefon włączony.");
        isOn = true;
    }
}
