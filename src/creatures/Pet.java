package creatures;

import interfaces.salleable;

public class Pet extends Animal implements salleable{
    public String name;

    public Pet(String species) {
        super(species);
    }

    public void takeForAWalk() {

        if (this.isAlive) {
            this.setWeight(-1.0);
        } else {
            System.out.println("Zwierze jest martwe. Nie możesz go wyprowadzić.");
        }
        if (this.getWeight() <= 0 && this.isAlive) {
            this.isAlive = false;
            System.out.println("Zwierze zmarło.");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet == null) {
            System.out.println("Sprzedający nie ma zwierzęcia do sprzedania!");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać cię na to zwierze!");
        } else {
            buyer.pet = seller.pet;
            buyer.cash -= price;
            seller.cash += price;
            seller.pet = null;
        }
    }
}
