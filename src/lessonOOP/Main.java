package OOP;

public class Main {
    static void main(String[] args) {

//       topic1 classes and objects

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println();

        boolean keyIn = false;

        if (keyIn) {
            car.isRunning = true;
            System.out.println(car.isRunning);
        } else {
            System.out.println("car is turned off");
        }

        System.out.println();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        System.out.println();

        car.drive();
        System.out.println("you drive a: " + car.make + " " + car.model); // same as the car.drive();
        System.out.println();
        car.brake();
        System.out.println("you brake a: " + car.make + " " + car.model); // same as the car.brake();


        System.out.println();

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car1.make + " " + car1.model); // this will print the same as car1

        System.out.println();

//        topic2 constructors
    }
}
