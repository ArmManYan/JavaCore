package lessonOOP;

public class Square {
    static int square(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        int x = square(5);
        x = square(9);

        int y = 2;
        x = square(y);

        System.out.println(x);
    }
}
