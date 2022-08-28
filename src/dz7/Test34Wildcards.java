package dz7;

import java.util.ArrayList;
import java.util.List;

public class Test34Wildcards {
    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird(1));
        birdList.add(new Bird(2));
        birdList.add(new Bird(3));
        birdMethod(birdList);
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck(11));
        duckList.add(new Duck(12));
        duckList.add(new Duck(13));
        birdMethod(duckList);

    }

    private static void birdMethod(List<? extends Bird> x) {
        for (Bird bird : x) {
            bird.fly();
        }

    }

}
