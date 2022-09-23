package src.dz13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractHandler file = null;
        System.out.println("input file format :");
        System.out.println("1 - xml ;  2 - txt ;  3 - doc ;  4 - exit");
        int input =0;
        while (input != 4){
            input = scanner.nextInt();
            if (input == 1){
                System.out.println("xml");
                file = new XMLHandler();
                break;
            } else if (input == 2) {
                System.out.println("txt");
                file = new TXTHandler();
                break;
            } else if (input == 3) {
                System.out.println("doc");
                file = new DOCHandler();
                break;
            } else if (input == 4) {
                System.out.println("exit");
            } else {
                System.out.println("invalid input");
            }
        }
        scanner.close();
        file.save();
        file.open();
        file.change();
        file.create();
    }
}
