package ARRayOfObjects;

public class Main {
    static void main(String[] args) {

        Car car1 = new Car("nardo gray", "porshce");
        Car car2 = new Car("black matt", "Audi RS7");
        Car car3 = new Car("grey", "BMW M6");

        Car[] cars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        for(Car car : cars) {
            car.drive();
        }
        Car[] cars1 = {
                new Car("grey", "BMW M6"),
                new Car("black matt", "Audi RS7"),
                new Car("nardo grey", "porsche")
        };

        System.out.println();

        for(Car car : cars) {
            car.color = "black";
        }

        for(Car car : cars) {
            car.drive();
        }

    }
}
