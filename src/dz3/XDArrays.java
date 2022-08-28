package dz3;

import java.util.Scanner;

public class XDArrays {
    public static void main(String[] args) {
        int[][][] threeDArray = new int[10][10][2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int o = 0; o < 10; o++) {
                for (int p = 0; p < threeDArray.length; p++) {
                    if (i == 0) {
                        threeDArray[p][o][i] = p * o;
                        System.out.printf("%-10s", p + "*" + o + "=" + threeDArray[p][o][i] + ";  ");
                    } else {
                        threeDArray[p][o][i] = p + o;
                    }
                }
                if (i == 0) {
                    System.out.println();
                }
            }
        }
        int num = scan.nextInt();
        int num1 = scan.nextInt();
        System.out.println(threeDArray[num][num1][1]);
        scan.close();
    }
}
