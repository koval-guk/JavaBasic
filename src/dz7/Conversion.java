package dz7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double res = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Input amount of money: ");
            double money = scan.nextDouble();
            System.out.print("Input exchange rate: ");
            double rate = scan.nextDouble();
            res = money * rate;
            if (rate < 0) {
                res = money / (-rate);
            }
            if (money <= 0 || rate == 0) {
                System.out.println("Error, try again");
                continue;
            } else {
                System.out.print("For your ");
                System.out.printf("%.2f", money);
                System.out.print(" you get ");
                System.out.printf("%.2f", res);
                System.out.println(" another money.");
            }
            System.out.print("Restart (any) / Exit (E) : ");
            char choice = scan.next().charAt(0);
            choice = Character.toUpperCase(choice);
            if (choice == 'E') {
                break;
            }
        }
        scan.close();
    }
}
