package super1;

public class Student extends Person {

    double gpa;

    Student(String firstN, String lastN, double gpa) {
        super(lastN, firstN);
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(this.firstN + "'s" + " " + "gpa is: " + this.gpa);
    }
}
