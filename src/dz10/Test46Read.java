package dz10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Test46Read {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("food.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Food[] foods = (Food[]) ois.readObject();
            System.out.println(Arrays.toString(foods));
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
