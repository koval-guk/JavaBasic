package dz2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введи \"3\"");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 3) {
            System.out.println("а вот так можно");
        }
        switch (num) {
            case 2:
                System.out.println("немного непопал");
                break;
            case 3:
                System.out.println("и вот так");
                break;
                /*/case 3:
                    System.out.println("так нельзя");/*/
            case 4:
                System.out.println("чуть-чуть не попал");
                break;
            default:
                System.out.println("не попал");
        }
    }
}
