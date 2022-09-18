package dz14;

import java.util.Arrays;

public class MyArrayList<T> {
    Object[] array = new Object[1];

    void add(T element) {
        if (array.length==1&&array[0]==null) {
            array[0] = element;
        } else {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length-1] = element;
        }
    }

    void remove(int index) {
        if (index >= 0 && index <= array.length) {
            int count = 0;
            Object[] newArray = new Object[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    i++;
                }
                newArray[count] = array[i];
                count++;
            }
            array = newArray;
        } else {
            System.out.println("No valid index");
        }
    }

    void clear() {
        array = new Object[1];
    }

    int size() {
        return array.length;
    }

    Object get(int index) {
        return array[index];
    }
}
