package homework.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private Company company;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID,
                    double salary, Company company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setCompany(Company company) { this.company = company; }
    public void setPosition(String position) { this.position = position; }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getEmployeeID() { return employeeID; }
    public double getSalary() { return salary; }
    public Company getCompany() { return company; }
    public String getPosition() { return position; }

    @Override
    public String toString() {
        String salaryText = (salary == (long) salary) ? String.valueOf((long) salary) : String.valueOf(salary);
        return "Employee ID: " + employeeID + "\n" +
                "Name: " + name + " " + surname + "\n" +
                "Salary: " + salaryText + "\n" +
                "Position: " + position + "\n" +
                "Company: " + (company == null ? "none" : company.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeID, employee.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }
}