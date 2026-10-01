package lesson2;

public class BlochText {
    static void main(String[] args) {
        int x, y;

        y = 20;

//        The target of this loop statement is a block of code.
        for(x = 0; x < 10; x++) {
            System.out.println("value x: " + x);
            System.out.println("value y: " + y);
            y = y - 2;
        }
    }
}
