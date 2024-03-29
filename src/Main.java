
import creatures.*;
import devices.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*Zadanie 1
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
        Car polonez = new LPG("FSO", "Caro Plus", 2000, 4000.0);
        polonez.color = "czerwony";
        polonez.millage = 100000;
        polonez.plate = "GDA1234";

        //Zadanie 3 i 4
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("\nPodaj wysokość nowego wynagrodznia dla " + me.firstName + " " + me.lastName + ": ");
            me.setSalary(Double.parseDouble(scan.nextLine()));
            System.out.println("Twoje obecne wynagrodzenie wynosi:" + me.getSalary() + "\n");
        }

        //Zadanie 5
        polonez.value = 2000.0;
        me.setCar(polonez, 0);

        //Zadanie 6
        Car polonez2 = new LPG("FSO", "Caro Plus", 2000, 4000.0);
        polonez2.color = "czerwony";
        polonez2.millage = 100000;
        polonez2.value = 2000.0;
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
        me.getCar(0).sell(me, random, 2500.0);
        System.out.println(random.getCar(0));

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

        random.getCar(0).refuel();*/

        //Zadanie 11
        Human bolek = new Human("Homo sapiens",1996);
        bolek.firstName = "Bolek";
        bolek.setSalary(5000.0);
        bolek.cash = 150000.0;

        Human lolek = new Human("Homo sapiens",1996,3);
        lolek.firstName = "Lolek";
        lolek.setSalary(6000.0);
        lolek.cash = 10000.0;

        Car Passat = new Diesel("Volkswagen", "Passat B5", 1999, 5000.0);
        Car Dacia = new LPG("Dacia", "Duster", 2015, 15000.0);
        Car Tesla = new Electric("Tesla", "model S", 2021, 50000.0);

        bolek.setCar(Passat, 1);
        bolek.setCar(Dacia, 0);
        lolek.setCar(Tesla, 0);
        lolek.setCar(Tesla, 0);

        System.out.println("Wartość garażu Bolka to: " + bolek.getGarageValue());
        System.out.println("Drugie auto Bolka to: " + bolek.getCar(1));

        System.out.println("Garaż Bolka przed sortowaniem: ");
        for(Car x:bolek.getGarage()){
            System.out.print(x + ", ");
        }
        System.out.println();

        bolek.sortGarage();
        System.out.println("Garaż Bolka po sortowaniu: ");
        for(Car x:bolek.getGarage()){
            System.out.print(x + ", ");
        }
        System.out.println();

        try {
            Tesla.sell(bolek, lolek, 50000.0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            Tesla.sell(lolek,bolek,50000.0);
        }
        catch (Exception f){
            f.printStackTrace();
        }
        try{
            Dacia.sell(bolek,lolek,Dacia.value);
        }
        catch (Exception g){
            g.printStackTrace();
        }
        try{
            Dacia.sell(bolek,lolek,10000.0);
            System.out.println(lolek.getCar(1));
            System.out.println(lolek.cash);
            System.out.println(bolek.getCar(1));
            System.out.println(bolek.cash);
        }
        catch (Exception h){
            h.printStackTrace();
        }

        //Zadanie 12
        System.out.println(lolek.getCar(1));
        System.out.println(Dacia.owners.get(Dacia.owners.size()-1));

        Dacia.anyOwner(lolek);
        Dacia.anyOwner(bolek);

        Human olek = new Human("Homo sapiens",2000);
        olek.firstName = "Olek";
        Dacia.anyOwner(olek);

        Dacia.checkTransaction(bolek, lolek);
        Dacia.checkTransaction(olek, lolek);
        Dacia.checkTransaction(olek, lolek);
        System.out.println("To auto było sprzedawane " + Dacia.howManyTransactions() + " razy.");

        //Zadanie 13
        olek.phone = new Phone("Xiaomi", "Mi 10T Lite", 2020, 1130.0, 6.7);

        Application messenger = new Application("Messenger");
        Application instagram = new Application("Instagram", "1.2.1");
        Application fm23m = new Application("Football Manager 23 Mobile", "1.2.3", 44.99);
        Application terraria = new Application("Terraria", "3.2.1", 23.99, "www.gryMobilne.pl");
        try{
            URL url2 = new URL("https", "googleApps.com", "whatsApp");
            Application whatsApp = new Application(url2);
            olek.phone.installAnApp(olek, whatsApp);
        }
        catch (Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        olek.phone.installAnApp(olek, terraria);
        olek.cash += 79.99;
        olek.phone.installAnApp(olek, terraria);
        System.out.println("Olkowi po zakupie aplikacji zostało " + olek.cash + " PLN.");


        olek.phone.checkIsInstalled(terraria);
        olek.phone.checkIsInstalled(fm23m);

        for (String s : Arrays.asList("whatsApp", "Messenger", "Terraria")) {
            olek.phone.checkIsInstalled(s);
        }

        ArrayList<Application> apps = new ArrayList<>();
        apps.add(instagram);
        apps.add(messenger);
        olek.phone.installAnApp(olek, apps);

        olek.phone.showFreeApps();

        olek.phone.installAnApp(olek, fm23m);
        System.out.println("\nWartość zainstalowanych aplikacji wynosi: " + olek.phone.showCostOfMyApps() + " PLN.\n");


        olek.phone.printAlphabeticOrder();
        olek.phone.printPriceOrder();
    }
}