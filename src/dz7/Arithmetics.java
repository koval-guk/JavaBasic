package dz7;

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 1st value: ");
        int a = scan.nextInt();
        System.out.println("Input operation: ");
        System.out.print(a + " ");
        char x = scan.next().charAt(0);
        System.out.println("Input 2th value: ");
        System.out.print(a + " " + x + " ");
        int b = scan.nextInt();
        System.out.print(a + " " + x + " " + b + " = ");
        if (x == '+') {
            add(a, b);
        } else if (x == '-') {
            sub(a, b);
        } else if (x == '*') {
            mul(a, b);
        } else if (x == '/') {
            div(a, b);
        } else {
            System.out.println("Error!");
        }
        scan.close();
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Error div 0");
        } else {
            System.out.println(a / b + "    rem " + a % b);
        }
    }
}
