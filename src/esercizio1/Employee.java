package esercizio1;

public class Employee {

    private String regNumber;
    private Department department;
    private double salary;

    public Employee(String regNumber, Department department, double salary) {
        this.regNumber = regNumber;
        this.department = department;
        this.salary = salary;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}
