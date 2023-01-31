package devices;

import creatures.Human;

import java.util.ArrayList;


public abstract class Car extends Device {
    public Integer millage;
    public String plate;

    public ArrayList<Human> owners = new ArrayList<>();

    public Car(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }


    public String toString() {
        return producer + " " + model + " " + yearOfProduction + " " + isOn + " " + color + " " + millage + " " + value;
    }

    @Override
    public void turnOn() {
        System.out.println("\nSamochód odpalony.");
        isOn = true;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.carIndex(this) < 0 && seller != this.owners.get(this.owners.size() - 1)) {
            throw new Exception("Sprzedający nie ma tego samochodu.");
        }

        if (buyer.carIndex(null) < 0) {
            throw new Exception("Kupujący nie ma wolnego mniejsca w garażu.");
        }

        if (buyer.cash < price) {
            throw new Exception("Kupujący ma za mało gotówki.");
        }

        buyer.setCar(this, buyer.carIndex(null));
        seller.removeCar(seller.carIndex(this));

        buyer.cash -= price;
        seller.cash += price;
        System.out.println("Transakcja zakończyła się sukcesem.");
    }

    public void anyOwner(Human owner) {
        for (Human x : this.owners) {
            if (x == owner) {
                System.out.println("Ta osoba była lub jest właścicielem tego pojazdu.");
                return;
            }
        }
        System.out.println("Ta osoba nighy nie była właścicielem tego auta.");
    }

    public void checkTransaction(Human seller, Human buyer) {
        if (this.owners.size() > 1) {
            for (int i = 0; i < this.owners.size() - 1; i++) {
                if ((this.owners.get(i) == seller && this.owners.get(i + 1) == buyer)) {
                    System.out.println(seller.firstName + " sprzedał to auto osobie " + buyer.firstName + ".");
                    return;
                }
            }
        }
        System.out.println("Nie było takiej sprzedaży.");
    }

    public int howManyTransactions(){
        return this.owners.size();
    }

    public abstract void refuel ();
}