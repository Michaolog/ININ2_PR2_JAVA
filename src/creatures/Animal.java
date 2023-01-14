package creatures;


import interfaces.Feedable;

public abstract class Animal implements Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_COW_WEIGHT = 700.0;
    private static final Double DEFAULT_HUMAN_WEIGHT = 70.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    final String species;
    private Double weight;
    Boolean isAlive;

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;

        switch (species){
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "cow" : this.weight = DEFAULT_COW_WEIGHT; break;
            case "homo sapiens" : this.weight = DEFAULT_HUMAN_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    @Override
    public void feed(){
        if(this.isAlive){
            this.weight += 1.0;
        }
        else{
            System.out.println("Zwierze jest martwe. Nie możesz go nakarmić.");
        }
    }

    @Override
    public void feed(Double foodWeight){
        if(this.isAlive){
            this.weight += foodWeight;
        }
        else{
            System.out.println("Zwierze jest martwe. Nie możesz go nakarmić.");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double x)
    {
        this.weight = this.weight - x;
    };

    public String toString(){
        return species+" "+weight+" "+isAlive;
    }
}
