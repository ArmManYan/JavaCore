package lesson3;

public class Variables {
    static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConverting int to byte.");
        b = (byte) i;
        System.out.println("\nConverting double to int.");
        i = (int) i;
        System.out.println("\nConverting double to byte.");
        b = (byte) d;

        System.out.println("d and b" + " " + d + " " + b);
    }
}