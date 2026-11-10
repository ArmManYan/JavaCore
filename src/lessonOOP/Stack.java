package lessonOOP;

public class TestStackDemo {
    private int[] items = new int[10];
    private int tos = -1;

    public void push(int value) {
        items[++tos] = value;
    }

    public int pop() {
        return items[tos--];
    }
}

