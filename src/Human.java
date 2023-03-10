import devices.Car;
import devices.Phone;

import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    public String phonenumber;
    public Animal pet;
    public Car car;
    public Phone phone;
    public Double cash;

    public Human(String firstName, String lastName, String phonenumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.car = car;
        this.cash = cash;
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

    public Car getterCar() {
        return car;
    }

    public void setterCar(Car car) {
        if (getterSalary() > car.value) {
            System.out.println("Udało się kupić za gotówkę pojazd.");
            this.car = car;
        } else if (getterSalary() > (car.value / 12)) {
            System.out.println("Udało się kupić pojazd, na kredyt(no trudno).");
            this.car = car;
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
}
