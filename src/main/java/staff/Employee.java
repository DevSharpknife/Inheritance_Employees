package staff;

public abstract class Employee {

    private String name;
    private String niNumber;     // mix of letters and numbers
    private Double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double rate_increase) {
        salary = salary + (salary * rate_increase);
    }

    public double getBonus() {
        return salary * 0.01;
    }

}
