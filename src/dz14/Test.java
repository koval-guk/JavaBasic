package dz14;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>();
        mal.add(2);
        mal.add(3);
        mal.add(3);
        mal.add(3);
        mal.add(7);
        mal.add(10);
        System.out.println(Arrays.toString(mal.array));
        System.out.println(mal.size());
        mal.clear();
        mal.add(0);
        mal.add(11);
        mal.add(22);
        mal.add(33);
        mal.add(44);
        mal.add(55);
        mal.remove(2);
        System.out.println(Arrays.toString(mal.array));
        System.out.println(mal.size());
        System.out.println(mal.get(3));
        MyArrayList<String> malS = new MyArrayList<>();
        malS.add("Hello");
        malS.add("Java");
        malS.remove(0);
        System.out.println(malS.size());
        malS.add("Basic");
        System.out.println(malS.size());
        System.out.println(Arrays.toString(malS.array));
    }
}
