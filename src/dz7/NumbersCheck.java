package dz7;

import java.util.Scanner;

public class NumbersCheck {
    static int value;
    static boolean sign;
    static boolean simple;
    static boolean divNum;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(sign + " " + simple + " " + divNum);
        System.out.print("Input integer :");
        value = scan.nextInt();
        System.out.println(value + " is positive : " + sign(value));
        System.out.println(value + " is simple : " + simple(value));
        System.out.println(value + " is divided by 2, 5, 3, 6, 9 without remainder : " + divNum(value));
        System.out.println("*********** не понял надо 1 метод или разные... ***************");
        multiMethod(value);
        scan.close();
    }


    static boolean sign(int value) {
        if (value >= 0) {
            sign = true;
        }
        return sign;
    }

    static boolean simple(int value) {
        int operateValue = value;
        int counter = 0;
        while (operateValue > 0) {
            if (value % operateValue == 0) {
                counter++;
            }
            operateValue--;
        }
        if (counter <= 2) {
            simple = true;
        }
        return simple;
    }

    static boolean divNum(int value) {
        if ((value % 2 == 0 && value % 5 == 0) && (value % 3 == 0 && value % 6 == 0) && value % 9 == 0) {
            divNum = true;
        }
        return divNum;
    }

    static void multiMethod(int value) {
        int operateValue = value;
        int counter = 0;
        System.out.print(value + " is");
        while (operateValue > 0) {
            if (value % operateValue == 0) {
                counter++;
            }
            operateValue--;
        }
        if (counter <= 2) {
            System.out.print(" simple,");
            ;
        } else {
            System.out.print(" not simple,");
        }
        if (value >= 0) {
            System.out.print(" positive,");
        } else {
            System.out.print(" negative,");
        }
        if ((value % 2 == 0 && value % 5 == 0) && (value % 3 == 0 && value % 6 == 0) && value % 9 == 0) {
            System.out.print(" divided by 2, 5, 3, 6, 9 without remainder.");
        } else {
            System.out.print(" not divided by 2, 5, 3, 6, 9 without remainder.");
        }
    }

}