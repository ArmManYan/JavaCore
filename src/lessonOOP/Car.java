package OOP;

public class Car {

//    these are attributes

    String make = "Audi";
    String model = "Rs7";
    int year = 2021;
    double price = 125000.5;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("car is starting");
    }

    void stop() {
        isRunning = false;
        System.out.println("car is stoping");
    }

    void drive() {
        System.out.println("you drive a: " + model);
    }

    void brake() {
        System.out.println("you brake a: " + model);
    }
}
