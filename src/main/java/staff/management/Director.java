package staff.management;

import staff.Employee;

public class Director extends Manager {
    Double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget)
    {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public double getBonus() {
        return getSalary() * 0.02;
    }
}

// Add a private property to store a double value budget.
// Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
// Create a getter method for this property.
// Test all methods.
