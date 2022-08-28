package dz3;

public class ArraysOfStrings {
    public static void main(String[] args) {
        int x = 0;
        String[] strArr = new String[4];
        strArr[0] = "Fire";
        strArr[1] = "One";
        strArr[2] = "Two";
        strArr[3] = "Three";
        for (String arr : strArr) {
            System.out.println(arr);
        }
        int[] intArr = {123, 45, 66};
        for (int i : intArr) {
            x = x + i;
            System.out.print(i + "+");
        }
        System.out.println("=" + x);
        for (int i = 3; i>-1; i--) {
            System.out.println(strArr[i]);
        }
    }
}
