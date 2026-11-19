package homework.employee;

public class MainTest {
    static void main(String[] args) {
        Company itSpace = new Company("C001", "ITSpace", "Information Technology", "Armenia");
        Company google = new Company("C002", "Google", "Technology", "USA");
        Company microsoft = new Company("C003", "Microsoft", "Technology", "USA");

        EmployeeStorage storage = new EmployeeStorage();

        storage.add(new Employee("Aram", "Petrosyan", "A0001", 350000, itSpace, "Java Developer"));
        storage.add(new Employee("Anna", "Hakobyan", "A0002", 400000, itSpace, "QA Engineer"));
        storage.add(new Employee("Karen", "Sargsyan", "A0003", 300000, google, "Designer"));
        storage.add(new Employee("Mari", "Avetisyan", "A0004", 450000, google, "Developer"));
        storage.add(new Employee("Davit", "Grigoryan", "A0005", 380000, itSpace, "Manager"));
        storage.add(new Employee("Lilit", "Mkrtchyan", "A0006", 320000, microsoft, "Analyst"));

        System.out.println("All employees");
        storage.printAll();

        System.out.println("Search by ID: A0003");
        storage.searchById("A0003");

        System.out.println("Search by ID: A9999");
    }
}