package dz10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test46Write {
    public static void main(String[] args) {
        Food[] foods = {new Food("eggs", 36.90, 200), new Food("Borsh", 250, 3000),
                new Food("meat", 150.50, 1200), new Food("bread", 15.70, 400)};
        try {
            FileOutputStream fos = new FileOutputStream("food.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(foods);
            oos.close();
        } catch (IOException e) {
        }
    }
}
