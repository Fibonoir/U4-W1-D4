package esercizio2;

public class CEO extends Employee {
    private int bonus = 10000;

    public CEO(String regNumber, Department department, double salary) {
        super(regNumber, department, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + this.bonus;

    }

    @Override
    public String toString() {
        return super.toString() + " Type: CEO, Full slary: " + calculateSalary();
    }

    @Override
    public void checkIn() {
        System.out.println("Employee " + getRegNumber() + " checked in");
    }
}
