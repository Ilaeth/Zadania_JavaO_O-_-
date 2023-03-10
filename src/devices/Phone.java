package devices;

import java.net.MalformedURLException;

public class Phone extends Device {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public String operationSystem;
    final static String DEFAULT_SERVER_ADDRESS = "Sklep-Play.pl";
    final static String DEFAULT_VERSION = "20";
    final static String DEFAULT_PROTOCOL = "255.255.255.255";
    String nameApp;
    String version;
    String serverAddress;
    String protocol;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void installAnnApp(String nameApp, String version, String serverAdress) throws MalformedURLException {
        this.nameApp = nameApp;
        this.version = DEFAULT_VERSION;
        this.serverAddress = DEFAULT_SERVER_ADDRESS;
        this.protocol = DEFAULT_PROTOCOL;
        System.out.println("Pobiera aplikację " + nameApp + " z adresu " + serverAdress);
        System.out.println("instaluje aplikację " + nameApp);
    }

    @Override
    public void turnOn() {
        System.out.println("Przesuń ekran palcem, aby odblokować");
    }

//    @Override
//    public void sell(Human seller, Human buyer, Double price) {
//        if (seller.phone != this) {
//            System.out.println(("Nie udana tranzakcja, brak towaru."));
//        } else if (buyer.cash < price) {
//            System.out.println(("Nie udana tranzakcja, brak środków."));
//        } else {
//            seller.cash += price;
//            buyer.cash -= price;
//            buyer.phone = seller.phone;
//            seller.phone = null;
//            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
//        }
//    }
}
