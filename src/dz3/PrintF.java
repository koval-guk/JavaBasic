package dz3;

import java.util.Scanner;

public class PrintF {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Целое");
        int myInt = num.nextInt();
        System.out.println("Строка");
        String myString = str.nextLine();
        System.out.println("Дробное");
        float myFloat = num.nextFloat();
        System.out.printf("*%100.10S* %n", myString);
        System.out.printf("|%o| %n", myInt);
        System.out.printf("%100.2f %n", myFloat);
        if (myInt < 1110000) {
            System.out.printf("unicode = " + "(%c)", myInt);
        }
        num.close();
        str.close();
    }
}
