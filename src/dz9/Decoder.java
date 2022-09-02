package dz9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = "src" + separator + "dz9" + separator + "Text.txt";
        File file = new File(path);
        Scanner scan = new Scanner(file);
        FileWriter codeWriter = new FileWriter("TextNew.txt", false);
        String text = "";
        while (scan.hasNextLine()) {
            text = scan.nextLine();
            text = text.replaceAll("\\s[пП]о(\\w+|\\s|\\.|,)", " Java ");
            text = text.replaceAll("\\sвВ(\\w+|\\s|\\.|,)", " Java ");
            text = text.replaceAll("\\s[нН]а(\\w+|\\s|\\.|,)", " Java ");
            text = text.replaceAll("\\sсС(\\w+|\\s|\\.|,)", " Java ");
            text = text.replaceAll("\\sкК(\\w+|\\s|\\.|,)", " Java ");
            System.out.println(text);
            codeWriter.write(text + "\n");
            codeWriter.flush();
        }
        scan.close();
    }
}
