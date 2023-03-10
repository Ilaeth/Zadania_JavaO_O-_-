package creatures;

public class Pet extends Animal {

    public Pet(String species, String name) {
        super(species, name);
    }

    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Thx for food. " + this.weight + "\n");
        } else
            System.out.print("Your died.\n");
    }
}
