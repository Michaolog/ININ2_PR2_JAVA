package creatures;

import interfaces.salleable;

public class Pet extends Animal implements salleable{
    public String name;
    private static final Double DEFAULT_DISTANCE = 1.0;
    private static final Boolean DEFAULT_IS_RUN = false;

    public Pet(String species) {
        super(species);
    }


    public void takeForAWalk(){
        this.takeForAWalk(DEFAULT_DISTANCE, DEFAULT_IS_RUN);
    }

    public void takeForAWalk(Double distance){
        this.takeForAWalk(distance, DEFAULT_IS_RUN);
    }
    public void takeForAWalk(Double distance, boolean isRun) {

        if (isAlive) {
            if(isRun) {
                this.setWeight(-distance);
                System.out.println("Bieganie wynosiło " + distance + " kilometrów.");
            }
            else {
                this.setWeight(-distance * 0.5);
                System.out.println("Spacer wynosił " + distance + " kilometrów.");
            }
        } else {
            System.out.println("Zwierze jest martwe. Nie możesz go wyprowadzić.");
        }
        if (this.getWeight() <= 0 && this.isAlive) {
            this.isAlive = false;
            System.out.println("Zwierze zmarło.");
        }
    }
}
