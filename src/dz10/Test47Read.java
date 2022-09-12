package dz10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Test47Read {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("food.bin"))) {
            Food[] foods = (Food[]) ois.readObject();
            System.out.println(Arrays.toString(foods));
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
