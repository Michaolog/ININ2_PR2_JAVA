import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        Human me = new Human(2000);
        me.firstName = "Michał";
        me.lastName = "Łuczak";
        me.pet = new Animal("felis");
        me.pet.name = "Feliks";

        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.feed();
        for(int i = 0; i < 5; i++) {
            System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
            me.pet.takeForAWalk();
        }
        me.pet.takeForAWalk();
        me.pet.feed();

        //Zadanie 2
        me.car = new Car("FSO", "Caro Plus");
        me.car.color = "czerwony";
        me.car.millage = 100000;

        //Zadanie 3 i 4
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.print("\nPodaj wysokość nowego wynagrodznia dla " + me.firstName + " " + me.lastName + ": ");
            me.setSalary(Double.parseDouble(scan.nextLine()));
            System.out.println("Twoje obecne wynagrodzenie wynosi:" + me.getSalary());
        }
    }
}