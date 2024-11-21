package esercizio2;

public abstract class Employee implements Checkable {

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

    public abstract double calculateSalary();

    public String toString() {
        return "Employee: " + getRegNumber() + " Department: " + getDepartment() + " Salary: " + getSalary();
    }

    @Override
    public void checkIn() {
        System.out.println("Employee \n" + getRegNumber() + "\nchecked in");
    }
}
