package devices;

public abstract class Car extends Device implements Comparable<Car> {
    public final String model;
    public final String producer;
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    public abstract void refuel();

    @Override
    public void turnOn() {
        System.out.println("Naciskam Start");
    }

//    @Override
//    public void sell(Human seller, Human buyer, Double price) {
//        if (seller.car != this) {
//            System.out.println(("Nie udana tranzakcja, brak towaru."));
//        } else if (buyer.cash < price) {
//            System.out.println(("Nie udana tranzakcja, brak środków."));
//        } else {
//            seller.cash += price;
//            buyer.cash -= price;
//            buyer.car = seller.car;
//            seller.car = null;
//            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
//        }
//    }

    @Override
    public int compareTo(Car car) {
        return this.yearofproduction - car.yearofproduction;
    }
}
