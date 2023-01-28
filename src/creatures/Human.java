package creatures;

import devices.Car;
import devices.Phone;

import java.util.Arrays;
import java.util.Date;

public class Human extends Animal{
    private static final int DEFAULT_GARAGE_SIZE = 2;
    public String firstName;
    public String lastName;
    final Integer yearOfBirth;
    public Pet pet;
    public FarmAnimal farmAnimal;
    private Car[] garage;
    public Phone phone;
    private Double salary = 0.0;
    private Double lastSalary = 0.0;
    private Date lastSalaryInfo;
    public Double cash = 0.0;


    public Human(String species, Integer yearOfBirth) {
        super(species);
        this.yearOfBirth = yearOfBirth;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String species, Integer yearOfBirth, Integer sizeOfGarage){
        super(species);
        this.yearOfBirth = yearOfBirth;
        this.garage = new Car[sizeOfGarage];
    }

    public Double getSalary(){
        if(lastSalaryInfo != null) {
            System.out.println("Informację o twoim wynagrodzeniu ostatnio pobierano: " + lastSalaryInfo);
        }
        else {
            System.out.println("Informację o twoim wynagrodzeniu ostatnio pobierano: nigdy");
        }
        System.out.println("Jego wysokość wynosiła wtedy: " + this.lastSalary);
        this.lastSalaryInfo = new Date();
        return this.salary;
    }
    public void setSalary(Double salary) {
        if(salary >= 0 && !this.salary.equals(salary)) {
            this.lastSalary = this.salary;
            this.salary = salary;
            System.out.println("Informacja o nowej wysokości wynagrodzenia została odnotowana w systemie księgowym!");
            System.out.println("Proszę odebrać aneks do umowy w dziale kadr!");
            System.out.println("ZUS i US już wiedzą ;) Nie ukrywaj nowego dochodu!\n");
        }
        else if(this.salary.equals(salary)){
            System.out.println("Wysokość wynagrodzenia jest już na podanym poziomie!!");
        }
        else{
            System.out.println("Wypłata nie może być ujemna!");
        }
    }

    public Car getCar(Integer carIndex){
        if(carIndex < this.garage.length && carIndex >= 0) {
            return garage[carIndex];
        }
        else {
            return null;
        }
    }

    public void setCar(Car car, Integer carIndex){
        if(carIndex < this.garage.length && carIndex >= 0 && this.garage[carIndex] == null) {
            this.garage[carIndex] = car;
        }
        else {
            System.out.println("Nie można dodać tego samochodu do garażu.");
        }
    }

    public int carIndex(Car car){
        for (int i = 0; i <= this.garage.length-1; i++) {
            if (this.garage[i] == car) {
                return i;
            }
        }
        return -1;
    }

    public void removeCar(int carIndex){
        this.garage[carIndex] = null;
    }

    public Car[] getGarage(){
        return garage;
    }

    public double getGarageValue(){
        double valueOfGarage = 0.0;
        for (Car x:garage)
        {
            if(x == null){
                valueOfGarage += 0.0;
            }
            else{
                valueOfGarage += x.value;
            }
        }
        return valueOfGarage;
    }

    public void sortGarage() {
        Car car;
        for (int i = 0; i <= garage.length - 1; i++) {
            for (int j = 0; j <= garage.length - 1; j++) {
                if(garage[i].yearOfProduction < garage[j].yearOfProduction){
                    car = garage[i];
                    garage[i] = garage[j];
                    garage[j] = car;
                }
            }
        }
    }
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Handel ludzmi jest nielegalny.");
    }

    public void feed(){
        System.out.println("Jem zupe!");
    }

    public String toString(){
        return firstName+" "+lastName+" "+yearOfBirth+" "+pet+" "+ Arrays.toString(garage) +" "+salary+" "+lastSalary+" "+lastSalaryInfo;
    }
}
