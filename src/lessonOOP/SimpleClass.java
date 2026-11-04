package OOP;

public class SimpleClass {
    static class Box {
        double width;
        double height;
        double depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box();

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        double volume = myBox.width * myBox.height * myBox.depth;

        System.out.println("The volume is equal to " + volume);
    }
}