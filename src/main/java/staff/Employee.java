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

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double rateIncrease) {
        if (rateIncrease > 0) {
            salary = salary + (salary * rateIncrease);
        }
    }

    public double getBonus() {
        return salary * 0.01;
    }

}
