package homework.employee;
import java.util.Scanner;

public class EmployeeDemo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();
        boolean run = true;

        while (run) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    run = false;
                    System.out.println("Program finished.");
                    break;
                case 1:
                    System.out.println("Please input employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Please input employee surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Please input employee id:");
                    String id = scanner.nextLine();

                    System.out.println("Please input employee company:");
                    String company = scanner.nextLine();

                    System.out.println("Please input employee position:");
                    String position = scanner.nextLine();

                    System.out.println("Please input employee salary:");
                    int salary = Integer.parseInt(scanner.nextLine());

                    Employee employee = new Employee(name, surname, id, salary, company, position);
                    storage.add(employee);
                    System.out.println("Employee successfully added!");
                    break;
                case 2:
                    storage.print();
                    break;
                case 3:
                    System.out.println("Please input employee ID:");
                    String searchId = scanner.nextLine();
                    storage.searchById(searchId);
                    break;
                case 4:
                    System.out.println("Please input company name:");
                    String searchCompany = scanner.nextLine();
                    storage.searchByCompany(searchCompany);
                    break;
                default:
                    System.out.println("Wrong command, try again.");
            }
        }
    }
}
