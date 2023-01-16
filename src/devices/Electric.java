package devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowałeś swojego elektryka.");
    }
}
