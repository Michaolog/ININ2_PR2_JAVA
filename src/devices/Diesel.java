package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano olej napędowy");
    }
}
