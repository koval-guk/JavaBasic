package dz11.task1;

import java.util.Scanner;

public class Rectangle {
    static double side1;
    static double side2;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st side of a rectangle :  ");
        side1 = scanner.nextDouble();
        System.out.print("Input 2nd side of a rectangle :  ");
        side2 = scanner.nextDouble();
        scanner.close();
        System.out.println("Area of a rectangle is " + areaCalculator(side1, side2));
        System.out.println("Perimeter of a rectangle is " + perimeterCalculator(side1, side2));
    }

    private static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    private static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }
}
