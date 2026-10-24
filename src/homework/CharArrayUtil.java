package homework;

import java.util.EnumSet;

public class CharArrayUtil {
    static void main(String[] args) {

        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

//        task1
        for (char char1 : chars) {
            System.out.print(char1);
        }

        System.out.println();

//        task2
        System.out.println("Characters count: " + chars.length);

        System.out.println("Last character: " + chars[chars.length - 1]);
        System.out.println("First character: " + chars[0]);

        System.out.println();

//        task3
        char c = 'a';
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Character " + c + " count: " + count);

        System.out.println();

//        task4
        boolean hasVowel = false;
        int vowelCount = 0;

        for (char l : chars) {
            if (l == 'A' || l == 'a' || l == 'E' || l == 'e' || l == 'I' || l == 'i' ||
                    l == 'O' || l == 'o' || l == 'U' || l == 'u') {
                vowelCount++;
                hasVowel = true;
            }
        }

        if (hasVowel) {
            System.out.println("Vowels found: " + vowelCount);
        } else {
            System.out.println("No vowels");
        }

        System.out.println();

//        task5
        boolean hasConsonants = false;
        int consonantCount = 0;

        for (char l1 : chars) {
            if (l1 == 'b' || l1 == 'c' || l1 == 'd' || l1 == 'f' || l1 == 'g' || l1 == 'h' ||
                    l1 == 'j' || l1 == 'k' || l1 == 'l' || l1 == 'm' || l1 == 'n' || l1 == 'p' ||
                    l1 == 'q' || l1 == 'r' || l1 == 's' || l1 == 't' || l1 == 'v' || l1 == 'w' ||
                    l1 == 'x' || l1 == 'y' || l1 == 'z' || l1 == 'B' || l1 == 'C' || l1 == 'D' ||
                    l1 == 'F' || l1 == 'G' || l1 == 'H' || l1 == 'J' || l1 == 'K' || l1 == 'L' ||
                    l1 == 'M' || l1 == 'N' || l1 == 'P' || l1 == 'Q' || l1 == 'R' || l1 == 'S' ||
                    l1 == 'T' || l1 == 'V' || l1 == 'W' || l1 == 'X' || l1 == 'Y' || l1 == 'Z') {
                consonantCount++;
                hasConsonants = true;
            }
        }

        if (hasConsonants) {
            System.out.println("Consonants found: " + consonantCount);
        } else {
            System.out.println("No consonants");
        }

        System.out.println();

//        task6
        int spaceCount = 0;

        for (char space : chars) {
            if (space == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Spaces count: " + spaceCount);

        System.out.println();

//        task7

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
            right--;
            left++;
        }

        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        // reverse back
        left = 0;
        right = chars.length - 1;
        while (left < right) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
            left++;
            right--;
        }

        System.out.println();

//        task8

        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            System.out.print(ch);
        }
        System.out.println();

        for (char ch : chars) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            System.out.print(ch);
        }

        System.out.println();

//        task9

        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        for (char ch1 : chars) {
            System.out.print(ch1);
        }

        System.out.println();

//      task10

        char[] chars2 = {'l', 'e', 'v', 'e', 'l'};

        int left2 = 0;
        int right2 = chars2.length - 1;
        boolean isPalindrome = true;

        while (left < right2) {
            if (chars2[left] != chars2[right2]) {
                isPalindrome = false;
                break;
            }
            right--;
            left++;
        }
        if (isPalindrome) {
            System.out.println("palidrome");
        } else {
            System.out.println("not a palidrome");
        }

        System.out.println();

//        bonus task1

        char[] chars3 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';

        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] == target) {
                System.out.println("index" + i);
                break;
            }
        }

        System.out.println();

//        bonus task2

        boolean equal = true;

        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        if (first.length != second.length) {
            equal = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println("Arrays are equal: " + equal);

        System.out.println();

//        bonus task3

        char[] charTwo = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < charTwo.length; i++) {
            boolean seen = false;

            for (int j = 0; j < i; j++) {
                if (charTwo[i] == charTwo[j]) {
                    seen = true;
                    break;
                }
            }

            if (!seen) {
                System.out.print(charTwo[i]);
            }
        }
        System.out.println();
    }
}