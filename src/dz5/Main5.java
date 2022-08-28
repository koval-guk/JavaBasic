package dz5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int ex = 0;
        Lesson5 l = new Lesson5();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of example, at 1 to 8 :");
        do {
            ex = scan.nextInt();
            switch (ex) {
                case (1):
                    l.prim1();
                    break;
                case (2):
                    l.prim2();
                    break;
                case (3):
                    l.prim3();
                    break;
                case (4):
                    l.prim4();
                    break;
                case (5):
                    l.prim5();
                    break;
                case (6):
                    l.prim6();
                    break;
                case (7):
                    l.prim7();
                    break;
                case (8):
                    l.prim8();
                    break;
            }
        } while ((ex > 0) & (ex < 9));
        scan.close();
        System.out.println("Quit");
    }
}
