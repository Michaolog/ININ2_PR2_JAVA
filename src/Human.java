import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    final Integer yearOfBirth;
    Animal pet;
    Car car;
    private Double salary = 0.0;
    private Double lastSalary = 0.0;
    private Date lastSalaryInfo;


    Human(Integer yearOfBirth) {
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
}
