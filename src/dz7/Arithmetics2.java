package dz7;

import java.util.Scanner;

public class Arithmetics2 {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 1st value: ");
        a = scan.nextInt();
        System.out.println("Input operation: ");
        System.out.print(a + " ");
        char x = scan.next().charAt(0);
        System.out.println("Input 2th value: ");
        System.out.print(a + " " + x + " ");
        b = scan.nextInt();
        System.out.print(a + " " + x + " " + b + " = ");
        if (x == '+') {
            add();
        } else if (x == '-') {
            sub();
        } else if (x == '*') {
            mul();
        } else if (x == '/') {
            div();
        } else {
            System.out.println("Error!");
        }
        scan.close();
    }

    public static void add() {
        System.out.println(a + b);
    }

    public static void sub() {
        System.out.println(a - b);
    }

    public static void mul() {
        System.out.println(a * b);
    }

    public static void div() {
        if (b == 0) {
            System.out.println("Error div 0");
        } else {
            System.out.println(a / b + "    rem " + a % b);
        }
    }
}
