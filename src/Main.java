import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "S10", 2020, 6.1, "android");

        Animal cat = new Animal("cat", "Jinx");

        Car bmw = new Car("x3", "bmw", 2012, 45000.00);
        Car bmw2 = new Car("5", "bmw", 2014, 100000.00);
        Car audi = new Car("4", "audi", 2019, 700000.00);

        Human me = new Human("Przemek", "Podlecki", "123456789");
        Human girl = new Human("Maria", "Ino", "321432542");

        Animal dog = new Animal("dog", "Hawana");

        System.out.println(dog.name);


        me.getterSalary();
        me.setterSalary(-50000);
        me.getterSalary();
        me.setterSalary(50000);
        me.getterSalary();

        me.setterCar(bmw);
        System.out.println(me.getterCar());
        me.setterCar(bmw2);
        System.out.println(me.getterCar());
        me.setterCar(audi);

        System.out.println(new Car("x3", "bmw", 2012, 45000.00).equals(new Car("5", "bmw", 2014, 100000.00)));
        System.out.println(bmw2.equals(bmw));
        System.out.println(bmw2);
        System.out.println(me);
        System.out.println(dog);
        System.out.println(samsung);

        System.out.println(bmw);
        samsung.turnOn();
        bmw.turnOn();

        me.pet = cat;
        me.cash = 1175.0;
        girl.cash = 150.0;
        me.pet.sell(me, girl, 100.0);
        me.pet = dog;
        me.pet.sell(me, girl, 100.0);
//        me.car.sell(me, girl, 24000.0);
//        girl.phone = samsung;
//        girl.phone.sell(girl, me, 1000.0);
    }
}
