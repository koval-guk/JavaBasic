package dz10;

public class Test49Recursion {
    public static void main(String[] args) {
        count(4, 30, 5);
    }

    private static int count(int num, int max, int step) {
        if (num >= max) {
            return max;
        }
        System.out.println(num + "+" + step + "=" + (num + step));
        return count(num + step, max, step);
    }
}
