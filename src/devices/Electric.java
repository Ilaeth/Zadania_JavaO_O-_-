package devices;

public class Electric extends Car {

    public Electric(String model, String producer, Integer yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowano baterie samochodu");
    }
}
