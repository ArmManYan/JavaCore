package lesson3;

public class Boolean {
    static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal " + b);
        b = true;
        System.out.println("b equal " + b);

        if(b) {
            System.out.println("this code is running. ");
        }
        b = false;
        if (b) {
            System.out.println("this code isn't running ");
        }
        System.out.println("10 > 9 equal " + (10 > 9));
    }
}
