package devices;

public class Car extends Device {
    public final String model;
    public final String producer;
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearofproduction, Double value) {
        super(model, producer, yearofproduction);
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Naciskam Start");
    }
}
