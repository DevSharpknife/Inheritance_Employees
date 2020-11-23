package staff.management;

import staff.Employee;

public class Manager extends Employee {
    String deptName;

    public Manager(String name, String niNumber, double salary, String deptName)
    {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}




// Create a subclass of staff.Employee called Manager in a package called staff.management.
// Create a class for Manager.
// Add a property to store the department name in a property called deptName.
// Create a constructor that includes all the parameters needed for staff.Employee and deptName.
// Add a getter method for deptName.
// Test all methods including raiseSalary and payBonus
