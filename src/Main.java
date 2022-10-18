public class Main {
    public static void main(String[] args) {

        Human me = new Human(2000);
        me.firstName = "Michał";
        me.lastName = "Łuczak";
        me.pet = new Animal("felis");
        me.pet.name = "Feliks";

        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.feed();
        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.takeForAWalk();
        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.takeForAWalk();
        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.takeForAWalk();
        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.takeForAWalk();
        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();


        me.car = new Car("FSO", "Caro Plus");
        me.car.color = "czerwony";
        me.car.millage = 100000;
    }
}