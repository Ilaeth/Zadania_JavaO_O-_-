public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    public Car car;

    public Human(String firstName, String lastName, String phone, Animal pet, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }
}
