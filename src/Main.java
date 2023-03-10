import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Diesel;
import devices.Electric;
import devices.LPG;
import devices.Phone;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Phone samsung = new Phone("Samsung", "S10", 2020, 6.1, "android");

        Pet cat = new Pet("cat", "Jinx");

        Diesel bmw = new Diesel("x3", "bmw", 2012, 45000.00);
        Electric bmw2 = new Electric("5", "bmw", 2014, 100000.00);
        LPG audi = new LPG("4", "audi", 2019, 700000.00);

        Human me = new Human("Przemek", "Podlecki", "123456789");
        Human girl = new Human("Maria", "Ino", "321432542");

        Pet dog = new Pet("dog", "Hawana");

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

        System.out.println(new Diesel("x3", "bmw", 2012, 45000.00).equals(new Electric("5", "bmw", 2014, 100000.00)));
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
//        me.pet.sell(me, girl, 100.0);
//        me.pet = dog;
//        me.pet.sell(me, girl, 100.0);
//        me.car.sell(me, girl, 24000.0);
//        girl.phone = samsung;
//        girl.phone.sell(girl, me, 1000.0);

        bmw.refuel();
        bmw2.refuel();
        audi.refuel();

        samsung.installAnnApp("gra", "2","0");
    }
}
