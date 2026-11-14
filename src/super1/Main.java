package super1;

public class Main {
    static void main(String[] args) {

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.45);

        student.showName();
        System.out.println(student.gpa);

        person.showName();

        student.showGpa();

    }

}
