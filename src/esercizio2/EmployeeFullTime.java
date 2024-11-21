package esercizio2;

public class EmployeeFullTime extends Employee {

    public EmployeeFullTime(String regNumber, Department department, double salary) {
        super(regNumber, department, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + " Type: Full Time, Full slary: " + calculateSalary();

    }

    @Override
    public void checkIn() {
        System.out.println("Employee " + getRegNumber() + " checked in");
    }

}
