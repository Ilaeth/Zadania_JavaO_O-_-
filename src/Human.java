import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    public Car car;
    private Double salary;

    public Human(String firstName, String lastName, String phone, Animal pet, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }

    public Double getterSalary() {
        System.out.println(LocalTime.now());
        System.out.println(salary);
        return salary;
    }
}
