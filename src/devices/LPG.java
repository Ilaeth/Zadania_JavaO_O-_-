package devices;

public class LPG extends Car {
    public LPG(String model, String producer, Integer yearofproduction, Double value) {
        super(model, producer, yearofproduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano samochód LPG");
    }
}
