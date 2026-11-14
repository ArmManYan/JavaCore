package lessonOOP;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Bob", 20, 60, true);
        Student student2 = new Student("Alisa", 24, 44, true);
        Student student3 = new Student("Bek", 30, 40, false);

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);

        System.out.println();

        System.out.println(student1.age);
        System.out.println(student2.age);
        System.out.println(student3.age);

        System.out.println();

        System.out.println(student1.gpa);
        System.out.println(student2.gpa);
        System.out.println(student3.gpa);

        System.out.println();

        System.out.println(student1.isEnrolled);
        System.out.println(student2.isEnrolled);
        System.out.println(student3.isEnrolled);
    }
}

