public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "S10", 6.1, "android");

        Animal cat = new Animal("cat", "Jinx");

        Car bmw = new Car("x3", "bmw");

        Human me = new Human("Przemek", "Podlecki", "123456789", cat, bmw);

        Animal dog = new Animal("dog", "Hawana");

        System.out.println(dog.name);
        dog.feed();
        dog.feed();
        dog.takeForAWalk();

        System.out.println(cat.name);
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
    }
}
