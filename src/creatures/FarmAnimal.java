package creatures;

import interfaces.Edbile;
import interfaces.salleable;

public class FarmAnimal extends Animal implements Edbile, salleable {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        System.out.println("\nZwierze zostało przeznaczone na zjedzenie.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.farmAnimal == null) {
            System.out.println("Sprzedający nie ma zwierzęcia do sprzedania!");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać cię na to zwierze!");
        } else {
            buyer.farmAnimal = seller.farmAnimal;
            buyer.cash -= price;
            seller.cash += price;
            seller.farmAnimal = null;
        }
    }
}
