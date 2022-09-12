package dz10;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20) - 10;
        }
        for (int x : arr) {
            System.out.print(x + "; ");
        }
        System.out.println();
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        max(arr);
        min(arr);
    }

    private static void max(int[] arr) {
        int maxCount = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr[arr.length - 1]) {
                maxCount++;
            }
            i++;
        }
        System.out.println("Maximum values " + maxCount + " pieces");
    }

    private static void min(int[] arr) {
        int minCount = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr[0]) {
                minCount++;
            }
            i++;
        }
        System.out.println("Maximum values " + minCount + " pieces");
    }
}
