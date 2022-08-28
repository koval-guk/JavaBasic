package dz3;

public class Arrays {
    public static void main(String[] args) {
        int x = 1;
        int[] num = new int[10];
        int[] statNum = {53, 3534, 75, 234, 765};
        for (int i = 0; i < num.length; i++) {
            x = x * 2;
            num[i] = i + x;
            System.out.print("[" + num[i] + "] " + i + " " + x + " ; ");
        }
        System.out.println();
        for (int i = 0; i < statNum.length; i++) {
            System.out.print(i + "->" + statNum[i] + "; ");
        }
    }
}
