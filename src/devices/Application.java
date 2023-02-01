package devices;

import java.net.URL;

public class Application implements Comparable<Application>{
    private static final String DEFAULT_APP_VERSION = "1.0.0";
    private static final String DEFAULT_APP_SERVER_ADRESS = "192.168.0.2";
    private static final Double DEFAULT_APP_PRICE = 0.0;

    String appName;
    String appVersion;
    String appServerAdress;
    Double appPrice;

    public Application(String appName) {
        this.appName = appName;
        this.appVersion = DEFAULT_APP_VERSION;
        this.appPrice = DEFAULT_APP_PRICE;
        this.appServerAdress = DEFAULT_APP_SERVER_ADRESS;
    }

    public Application(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appPrice = DEFAULT_APP_PRICE;
        this.appServerAdress = DEFAULT_APP_SERVER_ADRESS;
    }

    public Application(String appName, String appVersion, Double appPrice) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appPrice = appPrice;
        this.appServerAdress = DEFAULT_APP_SERVER_ADRESS;
    }

    public Application(String appName, String appVersion, Double appPrice, String appServerAdress) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appPrice = appPrice;
        this.appServerAdress = appServerAdress;
    }

    public Application(URL url){

        this.appName = url.getFile();
        this.appVersion = DEFAULT_APP_VERSION;
        this.appPrice = DEFAULT_APP_PRICE;
        this.appServerAdress = url.getHost();
    }

    @Override
    public String toString() {
        return appName +", ";
    }

    @Override
    public int compareTo(Application o) {
        return appName.compareTo(o.appName);
    }
}
