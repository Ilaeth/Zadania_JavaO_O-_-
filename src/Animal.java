import java.io.File;

public class Animal implements Salleable {
    final public String species;
    private Double weight;
    public String name;
    public File pic;

    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 50.0;
    static final public double DEFAULT_CAT_WEIGHT = 5.0;
    static final public double DEFAULT_COW_WEIGHT = 250.0;

    public Animal(String species, String name){
        this.species = species;
        this.name = name;

        switch (this.species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> this.weight = DEFAULT_COW_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed(){
        if (weight > 0) {
            weight += 1;
            System.out.print("Thx for food.\n");
        } else
            System.out.print("Pet died.\n");
    }

    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1;
            System.out.print("Thx for walk.\n");
        } else
            System.out.print("Pet died.\n");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println(("Nie udana tranzakcja, brak towaru."));
        } else if (buyer.cash < price) {
            System.out.println(("Nie udana tranzakcja, brak środków."));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
        }
    }
}
