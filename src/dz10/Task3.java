package dz10;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        //копирует 3 элемента из arr 3й позиции в тот же массив со 2й позиции :
        System.arraycopy(arr, 3, arr, 2, 3);
        //дублирует массив arr изменяя длинну на 5 :
        Arrays.copyOf(arr, 5); // копия не используется;  arr = ...
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
