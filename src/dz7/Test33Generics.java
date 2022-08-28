package dz7;

import java.util.ArrayList;
import java.util.List;

public class Test33Generics {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(456);
        numbers.add(4754);
        numbers.add(33);
        numbers.add(375);
        numbers.add(234);
        for (int i = 0; i <= 4; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
