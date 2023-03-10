public class Car {
    public final String model;
    public final String producer;
    public String color;
    public Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nmodel='" + model + '\'' +
                ", \nproducer='" + producer + '\'' +
                ", \nvalue=" + value + '}';
    }
}
