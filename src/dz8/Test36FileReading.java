package dz8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test36FileReading {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        File file1 = new File("StrOfInt");
        Scanner scan = new Scanner(file1);
        String fileStr = scan.nextLine();
        String path = scan.nextLine();
        String[] pathArr = path.split(",");
        int j = 0;
        StringBuilder strBild = new StringBuilder();
        for (String ignored : pathArr) {
            strBild.append(pathArr[j]).append(sep);
            j++;
        }
        strBild.deleteCharAt(strBild.length() - 1);
        File file2 = new File(String.valueOf(strBild));//src/dz8/StrOfInt
        Scanner scan1 = new Scanner(file2);
        String[] numStr = fileStr.split(" ");
        int[] num = new int[numStr.length];
        int i = 0;
        for (String numInt : numStr) {
            num[i++] = Integer.parseInt(numInt);
        }
        System.out.println(Arrays.toString(num));
        while (scan1.hasNextLine()) {
            String file2str = scan1.nextLine();
            System.out.println(file2str);
        }
        scan.close();
        scan1.close();
    }
}
