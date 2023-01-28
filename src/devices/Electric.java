package devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowałeś swojego elektryka.");
    }
}
