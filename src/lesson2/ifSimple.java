package lesson2;

public class ifSimple {
    static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;
        if(x == y) System.out.println("Now x equals y.");

        x = x * 2;
        if(x > y) System.out.println("x is greater then y");

        // this line will output nothing
        if(x == y) System.out.println("U wont see this");
    }
}
