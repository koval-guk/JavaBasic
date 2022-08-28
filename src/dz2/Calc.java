package dz2;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int b = 0;
        int resN = 0;
        int res = 0;
        String x = "";
        Scanner s = new Scanner(System.in);
        Scanner xx = new Scanner(System.in);
        System.out.println("Калькулятор простых действий: + - * /");
        System.out.println("Число А - Действие - Число Б");
        int a = s.nextInt();
        System.out.print(a);
        String xStr = "xStr";
        for (int i = 0; i < 100; i++) {
            x = xx.nextLine();
            if (x.equals("+")) {
                resN = 1;
                break;
            } else if (x.equals("-")) {
                resN = 2;
                break;
            } else if (x.equals("*")) {
                resN = 3;
                break;
            } else if (x.equals("/")) {
                resN = 4;
                break;
            } else if (i > 3) {
                System.out.println("ERROR    Хватит промахиваться. Калькулятор устал.");
                break;
            } else {
                System.out.println("Это не действие. Попробуй еще раз.");
                System.out.print(a);
            }
        }
        System.out.print(a + x);
        b = s.nextInt();
        switch (resN) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
        }
        System.out.println(a + x + b + "=" + res);
    }
}

