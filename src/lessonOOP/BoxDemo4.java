package lessonOOP;

class BoxDemo4 {
    static void main(String[] args) {
        Volume mybox1 = new Volume();
        Volume mybox2 = new Volume();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 11;
        mybox2.height = 22;
        mybox2.depth = 55;


        vol = mybox1.volume();
        System.out.println("volume equals to: " + vol);

        vol = mybox2.volume();
        System.out.println("volume equals to: " + vol);
    }
}
