package homework.employee;

import java.util.Objects;

public class Company {
    private String companyId;
    private String name;
    private String industry;
    private String country;

    public Company() {
    }

    public Company(String companyId, String name, String industry, String country) {
        this.companyId = companyId;
        this.name = name;
        this.industry = industry;
        this.country = country;
    }

    public void setCompanyId(String companyId) { this.companyId = companyId; }
    public void setName(String name) { this.name = name; }
    public void setIndustry(String industry) { this.industry = industry; }
    public void setCountry(String country) { this.country = country; }

    public String getCompanyId() { return companyId; }
    public String getName() { return name; }
    public String getIndustry() { return industry; }
    public String getCountry() { return country; }

    @Override
    public String toString() {
        return "ID: " + companyId + "\n" +
                "Name: " + name + "\n" +
                "Industry: " + industry + "\n" +
                "Country: " + country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyId, company.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId);
    }
}