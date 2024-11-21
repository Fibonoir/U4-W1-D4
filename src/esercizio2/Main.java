package esercizio2;

public class Main {

    public static void main(String[] args) {

        Employee firstEmployee = new EmployeeFullTime("123", Department.AMMINISTRAZIONE, 3000);
        Employee secondEmployee = new EmployeePartTime("456", Department.VENDITE, 100, 30);
        Employee thirdEmployee = new CEO("789", Department.PRODUZIONE, 3000);
        Volontario newVolontario = new Volontario("000", 25, "Nuovo CV");

        Checkable[] people = { firstEmployee, secondEmployee, thirdEmployee, newVolontario };

        for (Checkable person : people) {
            person.checkIn();

        }

        System.out.println();

        Employee[] employees = { firstEmployee, secondEmployee, thirdEmployee };
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }
}
