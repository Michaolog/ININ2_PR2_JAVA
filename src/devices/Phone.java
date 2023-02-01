package devices;

import creatures.Human;

import java.util.*;

class myAppPriceComparator implements Comparator<Application>{
    public int compare(Application app1, Application app2){
        int priceCmp = app1.appPrice.compareTo(app2.appPrice);
        if(priceCmp != 0){
            return priceCmp;
        }
        return app1.appName.compareTo(app2.appName);
    }
}
public class Phone extends Device{

    final Double screenSize;
    Set<Application> applicationSet = new TreeSet<>();

    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction + " " + isOn + " " + color + " " + " " + screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("\nTelefon włączony.");
        isOn = true;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null) {
            System.out.println("Sprzedający nie ma telefonu do sprzedania!");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać cię na ten telefon!");
        } else {
            buyer.phone = seller.phone;
            buyer.cash -= price;
            seller.cash += price;
            seller.phone = null;
        }
    }

     public void installAnApp(Human user, Application aplication) {
         if (user.cash >= aplication.appPrice) {
            this.applicationSet.add(aplication);
            user.cash -= aplication.appPrice;
             System.out.println("\nZainstalowano " + aplication.appName + ".\nW wersji " + aplication.appVersion + ".\nKosztującą " + aplication.appPrice + ".\nPobraną z serwera o adresie: " + aplication.appServerAdress);
         }
         else {
             System.out.println("\nTa aplikacja jest dla Ciebie za droga!");
         }
     }

     public void installAnApp(Human user, ArrayList<Application> appList) {
        for(Application app : appList){
            this.installAnApp(user, app);
        }
    }

    public void checkIsInstalled(Application application){
        if(this.applicationSet.contains(application)){
            System.out.println("\nPodana aplikacja jest zainstalowana na tym telefonie.");
        }
        else{
            System.out.println("\nPodana aplikacja nie jest zainstalowana na tym telefonie.");
        }
    }

    public void checkIsInstalled(String appName){
        for(Application x: this.applicationSet){
            if(Objects.equals(x.appName, appName)){
                System.out.println("\nPodana aplikacja jest zainstalowana na tym telefonie.");
                return;
            }
        }
        System.out.println("\nPodana aplikacja nie jest zainstalowana na tym telefonie.");
    }

    public void showFreeApps(){
        System.out.print("Darmowe aplikacje to: ");
        for(Application x: this.applicationSet){
            if(x.appPrice == 0.0){
                System.out.print(x.appName +", ");
            }
        }
        System.out.println();
    }

    public Double showCostOfMyApps(){
        Double cost = 0.0;
        for(Application x: this.applicationSet){
                cost += x.appPrice;
            }
    return cost;
    }

    public void printAlphabeticOrder(){
        System.out.print("Aplikacje posortowane według nazwy: ");
        for(Application x : this.applicationSet){
            System.out.print(x.toString());
        }
        System.out.println();
    }

    public void printPriceOrder(){
        TreeSet<Application> byPrice = new TreeSet<>(new myAppPriceComparator());
        byPrice.addAll(this.applicationSet);
        System.out.print("Aplikacje posortowane według ceny: ");
        for(Application x : byPrice){
            System.out.print(x.toString());
        }
        System.out.println();
    }
}
