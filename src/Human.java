import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalTime;
import java.util.Arrays;

public class Human {
    public String firstName;
    public String lastName;
    public String phonenumber;
    public Animal pet;
    public Car car;
    public Phone phone;
    public Double cash;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    public Car[] garage;

    public Human(String firstName, String lastName, String phonenumber, Integer garageSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.car = car;
        this.cash = cash;
        this.garage = new Car[garageSize];
    }

    public Double getterSalary() {
        System.out.println(LocalTime.now());
        System.out.println(cash);
        return cash;
    }

    public void setterSalary(double cash) {
        if (cash < 0)
            System.out.println("Wynagrodzenie mniejsze niż zero");
        else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Nie zapomnij odebrać aneksu do umowy od pani Hani z kadr.");
            System.out.println("Zus i US już wiedzą o zmianie wypłaty.");
            this.cash = cash;
        }
    }

    public Car getterCar(Integer garageNumber) {
        return garage[garageNumber];
    }

    public void setterCar(Car car) {
        if (getterSalary() > car.value) {
            System.out.println("Udało się kupić za gotówkę pojazd.");
            this.garage[this.garageFirstEmptyPlace()] = car;
        } else if (getterSalary() > (car.value / 12)) {
            System.out.println("Udało się kupić pojazd, na kredyt(no trudno).");
            this.garage[this.garageFirstEmptyPlace()] = car;
        } else
            System.out.println("Nie udało się zakupić pojazdu, zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", phone='" + phonenumber + '\'' +
                ", cash=" + cash +
                '}';
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar)
                return true;
        }
        return false;
    }

    public Double getGarageValue() {
        Double val = 0.0;
        for (Car car : garage) {
            val += car.value;
        }
        return val;
    }

    public void sortGarage() {
        Arrays.sort(garage);
    }

    public boolean garageHasEmptyPlace() {
        for (Car car : garage) {
            if (car == null)
                return true;

        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar) {
        garage[garageFirstEmptyPlace()] = newCar;
    }

    public Integer garageFirstEmptyPlace() {
        int index = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public void printGarage() {
        for (Car car : garage) {
            System.out.println(car);
        }
    }
}
