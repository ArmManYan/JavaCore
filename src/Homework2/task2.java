package Homework2;

public class task2 {
    public static void main(String[] args) {

        char symbol = '*';

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

