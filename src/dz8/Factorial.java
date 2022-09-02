package dz8;

import java.util.Scanner;

public class Factorial {
    private static int n = 0;
    private static long res = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input value 1 - 20 : ");
        int value = scan.nextInt();
        factorial(value);
        if (value > 20) {
            System.out.println("error " + res);
        } else {
            System.out.println("factorial " + value + " is " + res);
        }
        scan.close();
    }

    private static void factorial(int value) {
        n++;
        res = res * n;
        if (n < value) {
            factorial(value);
        }
    }
}