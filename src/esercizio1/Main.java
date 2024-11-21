package esercizio1;

public class Main {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("123", Department.AMMINISTRAZIONE, 1000);
        Employee secondEmployee = new Employee("456", Department.VENDITE, 2000);
        Employee thirdEmployee = new Employee("789", Department.PRODUZIONE, 3000);

        Employee[] employees = { firstEmployee, secondEmployee, thirdEmployee };
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getRegNumber() + " Department: " + employee.getDepartment()
                    + " Salary: " + employee.getSalary());

        }
    }
}
