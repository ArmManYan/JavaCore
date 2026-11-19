package homework.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    private void extend() {
        Company[] tmp = new Company[companies.length * 2];
        for (int i = 0; i < companies.length; i++) {
            tmp[i] = companies[i];
        }
        companies = tmp;
    }

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }

    public Company getById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(companyId)) {
                return companies[i];
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("Companies:");
        System.out.println();
        if (size == 0) {
            System.out.println("No companies yet.");
            return;
        }
        for (int i = 0; i < size; i++) {
            Company c = companies[i];
            System.out.println(c.getCompanyId() + " - " + c.getName() + " - " + c.getCountry());
        }
    }

    public void printById(String companyId) {
        Company company = getById(companyId);
        if (company == null) {
            System.out.println("Company not found.");
        } else {
            System.out.println("Company found:");
            System.out.println();
            System.out.println(company);
        }
    }
}