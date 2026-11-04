package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(10);
        da.add(20);
        da.add(30);

        System.out.println(da.getByIndex(0));  // 10
        System.out.println(da.getByIndex(2));  // 30
        System.out.println(da.getByIndex(5));  // -1
        System.out.println(da.getByIndex(-1)); // -1

        DynamicArray da2 = new DynamicArray();
        da2.add(4);
        da2.add(8);
        da2.add(12);
        da2.print();                           // 4 8 12

        // extend()-ի ստուգում
        DynamicArray da3 = new DynamicArray();
        for (int i = 1; i <= 25; i++) {
            da3.add(i);
        }
        da3.print();                           // 1-ից 25, ոչինչ չի կորել
        System.out.println(da3.getByIndex(24)); // 25
    }
}