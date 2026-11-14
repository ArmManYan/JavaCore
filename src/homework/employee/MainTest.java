package homework.employee;

public class MainTest {
    static void main(String[] args) {
        EmployeeStorage storage = new EmployeeStorage();

        storage.add(new Employee("Aram", "Petrosyan", "A0001", 350000, "ITSpace", "Java Developer"));
        storage.add(new Employee("Anna", "Hakobyan", "A0002", 400000, "ITSpace", "QA Engineer"));
        storage.add(new Employee("Karen", "Sargsyan", "A0003", 300000, "Google", "Designer"));
        storage.add(new Employee("Mari", "Avetisyan", "A0004", 450000, "Google", "Developer"));
        storage.add(new Employee("Davit", "Grigoryan", "A0005", 380000, "ITSpace", "Manager"));
        storage.add(new Employee("Lilit", "Mkrtchyan", "A0006", 320000, "Microsoft", "Analyst"));

        System.out.println("All employees");
        storage.print();

        System.out.println("Search by ID: A0003");
        storage.searchById("A0003");

        System.out.println("Search by ID: A9999");
        storage.searchById("A9999");

        System.out.println("Search by company: ITSpace");
        storage.searchByCompany("ITSpace");

        System.out.println("Search by company: Apple");
        storage.searchByCompany("Apple");
    }
}

