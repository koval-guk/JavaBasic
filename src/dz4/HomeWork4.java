package dz4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan;
        String str = "";
        String qStr = "";
        int num = 0;
        boolean loop = true;
        System.out.print("Input string and integer \n Input \"q\" to quit\n");
        do {
            scan = new Scanner(System.in);
            System.out.print("String : ");
            str = scan.nextLine();
            if (str.equals("q")) {
                System.out.println("Quit");
                break;
            }
            System.out.print("Integer : ");
            if (scan.hasNextInt()) {
                num = scan.nextInt();
            } else if (scan.hasNextInt() == false) {
                qStr = scan.nextLine();
                if (qStr.equals("q")) {
                    System.out.println("Quit");
                    break;
                }
                num = 0;
                System.out.println("This is no int. Let it be 0");
            }

            System.out.println("your String is \"" + str + "\" and your Integer is \"" + num + "\". Lets do loop again");
        } while (loop);
        scan.close();

    }
}
