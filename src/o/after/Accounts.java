package o.after;

public class Accounts {
    public Employee create(Applicant person) {

        Employee employee = new Employee();

        switch (person.typeOfEmployee) {
            case staff -> {
            }
            case manager -> employee = new Manager();
            case executive -> employee = new Executive();
        }

        employee.firstName = person.firstName;
        employee.lastName = person.lastName;
        employee.email = String.format("%s.%s@example.com", person.firstName, person.lastName);
        employee.setEmployeeRole();

        return employee;
    }
}
