package dz2;

import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Нелюбимая цифра?");
        int x = s.nextInt();
        int i = 0;
        System.out.println("вычеркиваем");
        while (true) {
            if (x > 9) {
                System.out.println("это не цифра");
                break;
            } else if (i == 10) {
                System.out.println();
                break;
            } else if (i == x) {
                System.out.print("- ");
                i++;
                continue; // continue тут лишнее. но работает. как пример
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

