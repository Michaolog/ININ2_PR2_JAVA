package devices;

import creatures.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "1.0.0";
    private static final String DEFAULT_APP_SERVER_ADRESS = "192.168.0.2";
    final Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
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

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

     public void installAnApp(String appName, String appVersion) {
        this.installAnApp(appName, appVersion, DEFAULT_APP_SERVER_ADRESS);
    }

     public void installAnApp(String appName, String appVersion, String appServerAdress) {
        System.out.println("Zainstalowano " + appName + " w wersji "+ appVersion +" pobraną z serwera o adresie: " + appServerAdress);
    }

     public void installAnApp(List<String> appsToInstall) {
        for(String appName : appsToInstall){
            this.installAnApp(appName);
        }
    }
    public void installAnApp(URL url){
        this.installAnApp(url.getFile(), DEFAULT_APP_VERSION, url.getHost());
    }
}
