package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();
        boolean run = true;

        while (run) {
            System.out.println();
            System.out.println("========== EMPLOYEE MANAGEMENT ==========");
            System.out.println();
            System.out.println("0 - EXIT");
            System.out.println();
            System.out.println("1 - ADD EMPLOYEE");
            System.out.println("2 - PRINT ALL EMPLOYEES");
            System.out.println("3 - SEARCH EMPLOYEE BY ID");
            System.out.println("4 - SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println();
            System.out.println("5 - ADD COMPANY");
            System.out.println("6 - PRINT ALL COMPANIES");
            System.out.println("7 - SEARCH COMPANY BY ID");
            System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9 - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
            System.out.println();
            System.out.println("=========================================");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0: {
                    run = false;
                    System.out.println("Program finished.");
                    break;
                }
                case 1: {
                    System.out.println("Enter employee name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter employee surname:");
                    String surname = scanner.nextLine();

                    System.out.println("Enter employee ID:");
                    String id = scanner.nextLine();

                    System.out.println("Enter employee salary:");
                    double salary;
                    try {
                        salary = Double.parseDouble(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Salary must be a number. Employee not added.");
                        break;
                    }

                    System.out.println("Enter employee position:");
                    String position = scanner.nextLine();

                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();

                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company with ID " + companyId + " not found.");
                        System.out.println("Please add the company first.");
                        break;
                    }

                    employeeStorage.add(new Employee(name, surname, id, salary, company, position));
                    System.out.println("Employee successfully added!");
                    break;
                }
                case 2: {
                    employeeStorage.printAll();
                    break;
                }
                case 3: {
                    System.out.println("Enter employee ID:");
                    employeeStorage.searchById(scanner.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("Enter company name:");
                    employeeStorage.searchByCompanyName(scanner.nextLine());
                    break;
                }
                case 5: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();

                    System.out.println("Enter company name:");
                    String companyName = scanner.nextLine();

                    System.out.println("Enter industry:");
                    String industry = scanner.nextLine();

                    System.out.println("Enter country:");
                    String country = scanner.nextLine();

                    companyStorage.add(new Company(companyId, companyName, industry, country));
                    System.out.println("Company successfully added!");
                    break;
                }
                case 6: {
                    companyStorage.printAll();
                    break;
                }
                case 7: {
                    System.out.println("Enter company ID:");
                    companyStorage.printById(scanner.nextLine());
                    break;
                }
                case 8: {
                    System.out.println("Enter company ID:");
                    String companyId = scanner.nextLine();
                    Company company = companyStorage.getById(companyId);
                    if (company == null) {
                        System.out.println("Company not found.");
                        break;
                    }
                    System.out.println("Company: " + company.getName());
                    System.out.println();
                    employeeStorage.printByCompanyId(companyId);
                    break;
                }
                case 9: {
                    System.out.println("Enter employee ID:");
                    Employee employee = employeeStorage.getById(scanner.nextLine());
                    if (employee == null) {
                        System.out.println("Employee not found.");
                        break;
                    }
                    System.out.println("Current company: "
                            + (employee.getCompany() == null ? "none" : employee.getCompany().getName()));

                    System.out.println("Enter new company ID:");
                    Company newCompany = companyStorage.getById(scanner.nextLine());
                    if (newCompany == null) {
                        System.out.println("Company not found. The old company stays unchanged.");
                        break;
                    }
                    employee.setCompany(newCompany);
                    System.out.println("Employee company successfully changed!");
                    System.out.println();
                    System.out.println("New company: " + newCompany.getName());
                    break;
                }
                case 10: {
                    System.out.println("Enter employee ID:");
                    Employee employee = employeeStorage.getById(scanner.nextLine());
                    if (employee == null) {
                        System.out.println("Employee not found.");
                        break;
                    }
                    System.out.println("Employee: " + employee.getName() + " " + employee.getSurname());
                    System.out.println();
                    if (employee.getCompany() == null) {
                        System.out.println("This employee has no company.");
                    } else {
                        System.out.println("Company information:");
                        System.out.println(employee.getCompany());
                    }
                    break;
                }
                default:
                    System.out.println("Wrong command, try again.");
            }
        }
    }
}