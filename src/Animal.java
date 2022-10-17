public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    final String species;
    String name;
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
}
