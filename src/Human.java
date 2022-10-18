public class Human {
    String firstName;
    String lastName;
    final Integer yearOfBirth;
    Animal pet;
    Car car;
    private Double salary;
    private Double lastSalary;

    Human(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void getSalary(){
        this.salary;
    }
    public void setSalary(Double salary) {
        if(salary >= 0 && !this.salary.equals(salary)) {
            this.lastSalary = this.salary;
            this.salary = salary;
            System.out.println("Informacja o nowej wysokości wynagrodzenia została odnotowana w systemie księgowym!");
            System.out.println("Proszę odebrać aneks do umowy w dziale kadr!");
            System.out.println("ZUS i US już wiedzą ;) Nie ukrywaj nowego dochodu!");
        }
        else if(this.salary.equals(salary)){
            System.out.println("Wysokość wynagrodzenia jest już na podanym poziomie!!");
        }
        else{
            System.out.println("Wypłata nie może być ujemna!");
        }
    }
}
