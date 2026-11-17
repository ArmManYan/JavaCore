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
        employees[size] = employee;
        size++;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No employees yet");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }
    }

    public void searchById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                System.out.println("Employee found:");
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found.");
    }

    public void searchByCompany(String company) {
        boolean found = false;
        for(int i = 0; i < size; i++) {
            if(employees[i].getCompany().equals(company)) {
                System.out.println(employees[i]);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in company " + company);
        }
    }
}
