package dz10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count;
        int max;
        String[] fillings = {"anger", "awe", "joy", "love", "grief"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input sting: ");
        String letters = scanner.nextLine();
        scanner.close();
        letters = letters.toLowerCase();
        char[] lettersArray = letters.toCharArray();
        for (int fillingsCount = 0; fillingsCount < fillings.length; fillingsCount++) {
            max = letters.length();
            for (int fillCount = 0; fillCount < fillings[fillingsCount].length(); fillCount++) {
                count = 0;
                for (int lettersCount = 0; lettersCount < lettersArray.length; lettersCount++) {
                    if (lettersArray[lettersCount] == fillings[fillingsCount].charAt(fillCount)) {
                        count++;
                    }
                }
                if (max > count) {
                    max = count;
                }
            }
            System.out.println(fillings[fillingsCount] + " " + max);
        }
        System.out.println();
        System.out.println(lettersArray);
    }
}
