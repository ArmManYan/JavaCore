package lessonOOP;

public class Student {

    String name;
    int age;
    int gpa;
    boolean isEnrolled;

    Student(String n, int a, int g, boolean isEnrolled) {
        this.name = n;
        this.age = a;
        this.gpa = g;
        this.isEnrolled = isEnrolled;
    }

    void study() {
        System.out.println(this.name + " is studing!");
    }

}
