package creatures;

import creatures.Human;
import interfaces.salleable;

public class Animal implements salleable {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    final String species;
    public String name;
    private Double weight;
    Boolean isAlive;

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;

        switch (species){
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed(){
        if(this.isAlive){
            this.weight += 1.0;
        }
        else{
            System.out.println("Zwierze jest martwe. Nie możesz go nakarmić.");
        }
    }

    public void takeForAWalk(){

        if(this.isAlive){
            this.weight -= 1.0;
        }
        else{
            System.out.println("Zwierze jest martwe. Nie możesz go wyprowadzić.");
        }
        if (this.weight <= 0 && this.isAlive) {
            this.isAlive = false;
            System.out.println("Zwierze zmarło.");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String toString(){
        return species+" "+name+" "+weight+" "+isAlive;
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
