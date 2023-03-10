package creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten() {
        System.out.println("Animal is eaten");
    }

    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Animal weight is now " + this.weight + "\n");
        } else
            System.out.print("This animal died.\n");
    }
}
