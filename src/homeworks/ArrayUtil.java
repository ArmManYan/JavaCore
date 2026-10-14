package homeworks;

public class ArrayUtil {
    static void main(String[] args) {


        int[] nums = {1, 6, 3, 9, 15, 52, -3, 5, 8};

//        task1

//        method1
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
//        method2
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

//        task2
        System.out.println("first element: " + nums[0]);

        System.out.println();

//        task3

            System.out.print("last element: " + nums[nums.length - 1]);

        System.out.println();

//          task4

        System.out.println("Array length: " + nums.length);

        System.out.println();

//        task5

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Minimum number: " + min);

        System.out.println();

//        task6

        if (nums.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (nums.length % 2 == 0) {
            System.out.println("Middle element: " + nums[nums.length / 2 - 1] + " " + nums[nums.length / 2]);
        } else {
            System.out.print("Middle element: " + nums[nums.length / 2]);
        }

        System.out.println();

//        task7-8

        int odds = 0;
        int evens = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Even numbers count: " + evens);
        System.out.println("Odd numbers count: " + odds);

        System.out.println();

//        task9

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Sum: " + sum);

        System.out.println();

//        task10

        double average = (double) sum / nums.length;
        System.out.println("Average: " + average);
    }
}
