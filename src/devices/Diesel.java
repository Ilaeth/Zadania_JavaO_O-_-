package devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, Integer yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód Dieslem");
    }
}
