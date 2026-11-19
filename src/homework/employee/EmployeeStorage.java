package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[5];
    private int size = 0;

    private void extend() {
        Employee[] tmp = new Employee[employees.length * 2];
        for (int i = 0; i < employees.length; i++) {
            tmp[i] = employees[i];
        }
        employees = tmp;
    }

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public Employee getById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("No employees yet.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }
    }

    public void searchById(String employeeId) {
        Employee e = getById(employeeId);
        if (e == null) {
            System.out.println("Employee with ID " + employeeId + " not found.");
            return;
        }
        System.out.println("Employee found:");
        System.out.println(e.getName() + " " + e.getSurname());
        System.out.println("Position: " + e.getPosition());
        System.out.println("Company: " + (e.getCompany() == null ? "none" : e.getCompany().getName()));
    }

    public void searchByCompanyName(String companyName) {
        boolean found = false;
        System.out.println("Employees:");
        System.out.println();
        for (int i = 0; i < size; i++) {
            Company c = employees[i].getCompany();
            if (c != null && c.getName().equals(companyName)) {
                System.out.println(employees[i].getEmployeeID() + " - "
                        + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + companyName);
        }
    }

    public void printByCompanyId(String companyId) {
        boolean found = false;
        System.out.println("Employees:");
        for (int i = 0; i < size; i++) {
            Company c = employees[i].getCompany();
            if (c != null && c.getCompanyId().equals(companyId)) {
                System.out.println(employees[i].getEmployeeID() + " - "
                        + employees[i].getName() + " " + employees[i].getSurname());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees in this company.");
        }
    }
}