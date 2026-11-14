package tostring;

public class Main {
    static void main(String[] args) {

        Car car1 = new Car("porsche", "turbo-S", 2021, "black");
        Car car2 = new Car("BMW", "M4", 2021, "green");

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year); /* meaningful details */
        System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + car2.year);
    }
}
