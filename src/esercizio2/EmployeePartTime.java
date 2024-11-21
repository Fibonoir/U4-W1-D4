package esercizio2;

public class EmployeePartTime extends Employee {
    private int hoursWorked;

    public EmployeePartTime(String regNumber, Department department, double salary, int hoursWorked) {
        super(regNumber, department, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getSalary() * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " Type: Part Time, Hours worked: " + hoursWorked + ", Salary: " + calculateSalary();
    }

    @Override
    public void checkIn() {
        System.out.println("Employee " + getRegNumber() + " checked in");
    }

}
