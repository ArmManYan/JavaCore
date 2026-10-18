package homework;

public class ArrayHomework {
    static void main(String[] args) {
//        task1
        int[] nums = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                c++;
            }
        }
        System.out.println("Count of " + n + ": " + c);

        System.out.println();

//        task2

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            right--;
            left++;
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();

//        task3
        int[] nums2 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int count = 0;

        for (int i = 0; i < nums2.length; i++) {
            boolean before = false;
            boolean after = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums2[i]) {
                    if (j < i) {
                        before = true;
                    } else if (j > i) {
                        after = true;
                    }
                }
            }

            if (after && !before) {
                count++;
            }
        }

        System.out.println("Repeated numbers count: " + count);

        System.out.println();

//        task4

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        boolean hasVowel = false;
        int count1 = 0;

        for (char l : chars) {
            if (l == 'ա' || l == 'ե' || l == 'է' || l == 'ը' ||
                    l == 'ի' || l == 'ո' || l == 'օ') {
                hasVowel = true;
                count++;
            }
        }

        if (hasVowel) {
            System.out.println("Vowels found: " + count);
        } else {
            System.out.println("No vowels");
        }

    }
}

