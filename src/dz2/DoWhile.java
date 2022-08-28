package dz2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int x = '\u0038';
        int input;
        Scanner s = new Scanner(System.in);
        System.out.println("Угадай число");
        do {
            input = s.nextInt();
            if (input > x) {
                System.out.println("меньше");
            }
            if (input < x) {
                System.out.println("больше");
            }
        }
        while (input != x);
        System.out.println(input + "  -  точно!!!");
    }
}
