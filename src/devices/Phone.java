package devices;

public class Phone extends Device {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
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
