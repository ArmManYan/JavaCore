package lessonOOP;

class BoxDemo {
    static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 15;
        mybox2.height = 7;
        mybox2.depth = 13;

        mybox1.volume();
        mybox2.volume();
    }
}
