package creatures;

import devices.Car;
import devices.Phone;

import java.util.Date;
public class Human extends Animal{
    public String firstName;
    public String lastName;
    final Integer yearOfBirth;
    public Pet pet;
    public FarmAnimal farmAnimal;
    private Car car;
    public Phone phone;
    private Double salary = 0.0;
    private Double lastSalary = 0.0;
    private Date lastSalaryInfo;
    public Double cash = 0.0;


    public Human(String species, Integer yearOfBirth) {
        super(species);
        this.yearOfBirth = yearOfBirth;
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

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        if (car.value != null) {
            if (this.salary > car.value) {
                System.out.println("Udało się kupić auto za gotówkę.");
                this.car = car;
            } else if ((this.salary * 12) > car.value) {
                System.out.println("Udało się kupić auto na kredyt.");
                this.car = car;
            } else {
                System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
            }
        }
        else {
            this.car = null;
        }
    }
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Handel ludzmi jest nielegalny.");
    }

    public void feed(){
        System.out.println("Jem zupe!");
    }

    public String toString(){
        return firstName+" "+lastName+" "+yearOfBirth+" "+pet+" "+car+" "+salary+" "+lastSalary+" "+lastSalaryInfo;
    }
}
