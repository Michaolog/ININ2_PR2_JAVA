package devices;

import creatures.Human;

public abstract class Car extends Device{
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() == null){
            System.out.println("Sprzedający nie ma auta do sprzedania!");
        }
        else if(buyer.cash < price){
            System.out.println("Nie stać cię na to auto!");
        }
        else {
            buyer.setCar(seller.getCar());
            if(buyer.getCar() != null){
                buyer.cash -= price;
                seller.cash += price;
                Car none = new Diesel(null, null, null);
                seller.setCar(none);
            }
            else {
                System.out.println("Nie kupisz tego auta. Masz za niską pensję, nie zarobisz na utrzymanie.");
            }
        }
    }
    public abstract void refuel();
}
