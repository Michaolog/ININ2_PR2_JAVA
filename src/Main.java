
import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import devices.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        Human me = new Human("homo sapiens", 2000);
        me.firstName = "Michał";
        me.lastName = "Łuczak";
        me.pet = new Pet("felis");
        me.pet.name = "Feliks";

        System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
        me.pet.feed();
        for (int i = 0; i < 5; i++) {
            System.out.println("Obecna waga " + me.pet.name + "a wynosi: " + me.pet.getWeight() + ".");
            me.pet.takeForAWalk();
        }
        me.pet.takeForAWalk();
        me.pet.feed();

        //Zadanie 2
        Car polonez = new LPG("FSO", "Caro Plus", 2000);
        polonez.color = "czerwony";
        polonez.millage = 100000;

        //Zadanie 3 i 4
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("\nPodaj wysokość nowego wynagrodznia dla " + me.firstName + " " + me.lastName + ": ");
            me.setSalary(Double.parseDouble(scan.nextLine()));
            System.out.println("Twoje obecne wynagrodzenie wynosi:" + me.getSalary() + "\n");
        }

        //Zadanie 5
        polonez.value = 2000;
        me.setCar(polonez);

        //Zadanie 6
        Car polonez2 = new LPG("FSO", "Caro Plus", 2000);
        polonez2.color = "czerwony";
        polonez2.millage = 100000;
        polonez2.value = 2000;
        Car polonez3 = polonez;

        System.out.println("\n" + polonez.equals(polonez2));
        System.out.println("Polonez hashcode is:" + polonez.hashCode());
        System.out.println("Polonez2 hashcode is:" + polonez2.hashCode());

        System.out.println("\n" + polonez.equals(polonez3));
        System.out.println("Polonez hashcode is:" + polonez.hashCode());
        System.out.println("Polonez3 hashcode is:" + polonez3.hashCode());

        Phone phone = new Phone("Xiaomi", "Mi 10T Lite", 2000, 6.7);
        System.out.println("\n" + polonez);
        System.out.println(me.pet);
        System.out.println(me);
        System.out.println(phone);

        //Zadanie7
        polonez.turnOn();
        phone.turnOn();

        //Zadanie 8
        Human random = new Human("homo sapiens", 1977);
        random.cash = 3500.0;
        random.setSalary(3700.0);
        me.getCar().sell(me, random, 2500.0);
        System.out.println(random.getCar());

        //Zadanie 9
        me.farmAnimal = new FarmAnimal("cow");
        me.farmAnimal.feed(10.0);
        me.farmAnimal.beEaten();

        //Zadanie 10
        Phone nokia = new Phone("Nokia", "Lumia", 2016, 6.7);
        List<String> appList = new ArrayList<>();
        appList.add("Messenger");
        appList.add("Instagram");
        appList.add("Gadu-gadu");

        nokia.installAnApp(appList);

        try {
            URL url = new URL("https", "appserver.com", "whatsapp");
            nokia.installAnApp(url);
            URL url2 = new URL("zzzzzzzz", "appserver.com", "whatsapp");
            nokia.installAnApp(url2);

        } catch (Exception e){
            System.out.print("Nie udało się. ");
            System.out.println(e.getMessage()+"\n");
        }

        random.getCar().refuel();
    }
}