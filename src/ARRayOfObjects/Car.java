package ARRayOfObjects;

public class Car {
    String color;
    String model;

    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void drive() {
        System.out.println("You drive " + this.color + " " + this.model);
    }

}
