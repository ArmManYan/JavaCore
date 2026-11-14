package homework.employee;
import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;

    Employee() {
    }



    Employee(String name, String surname, String employeeID, int salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setPosition(String position) {
        this.position = position;
    }



    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public double getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Employee ID: " + employeeID + "\n" +
                "Salary: " + salary + "\n" +
                "Company: " + company + "\n" +
                "Position: " + position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;

        return Double.compare(employee.salary, salary) == 0
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(employeeID, employee.employeeID)
                && Objects.equals(company, employee.company)
                && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company, position);
    }
}
