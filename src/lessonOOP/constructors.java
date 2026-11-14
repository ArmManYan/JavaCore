package lessonOOP;

public class constructors {
    double width;
    double height;
    double depth;

    constructors() {   // this is a constructor!!!
        System.out.println("constructor of object box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
class constructorDemo {
    static void main(String[] args) {
        constructors myCons1 = new constructors();
        constructors myCons2 = new constructors();

        double vol;

        vol = myCons1.volume();
        System.out.println("volume equals to: " + vol);

        vol = myCons2.volume();
        System.out.println("volume equals to: " + vol);
    }
}

