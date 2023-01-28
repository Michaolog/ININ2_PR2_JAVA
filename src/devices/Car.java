package devices;

import creatures.Human;


public abstract class Car extends Device{
    public Integer millage;
    public String plate;

    public Car(String producer, String model, Integer yearOfProduction, Double value){
        super(producer, model, yearOfProduction, value);
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(seller.carIndex(this) < 0){
            throw new Exception("Sprzedający nie ma tego samochodu.");
        }

        if(buyer.carIndex(null) < 0){
            throw new Exception("Kupujący nie ma wolnego mniejsca w garażu.");
        }

        if(buyer.cash < price){
            throw new Exception("Kupujący ma za mało gotówki.");
        }

        buyer.setCar(this, buyer.carIndex(null));
        seller.removeCar(seller.carIndex(this));

        buyer.cash -= price;
        seller.cash += price;
        System.out.println("Transakcja zakończyła się sukcesem.");
    }
    public abstract void refuel ();
}