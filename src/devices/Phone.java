package devices;

import creatures.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null){
            System.out.println("Sprzedający nie ma telefonu do sprzedania!");
        }
        else if(buyer.cash < price){
            System.out.println("Nie stać cię na ten telefon!");
        }
        else {
            buyer.phone = seller.phone;
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
        }
    }
}
