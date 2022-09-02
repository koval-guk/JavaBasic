package dz3;

import java.util.Scanner;

public class PrintF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Целое");
        int myInt = scan.nextInt();
        System.out.println("Строка");
        String myString = scan.nextLine();
        System.out.println("Дробное");
        float myFloat = scan.nextFloat();
        System.out.printf("*%100.10S* %n", myString);
        System.out.printf("|%o| %n", myInt);
        System.out.printf("%100.2f %n", myFloat);
        if (myInt < 1110000) {
            System.out.printf("unicode = " + "(%c)", myInt);
        }
    }
}
