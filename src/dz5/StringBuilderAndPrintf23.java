package dz5;

public class StringBuilderAndPrintf23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        double doub = 1;
        for (int i = 1; i < 10; i++) {
            sb.append(" + 1");
            int x = i + i;
            System.out.printf("%d%s = %d\n", i, sb, x);
            doub = doub + doub / i / x;
        }
        System.out.printf("%100.3f\n", doub);
    }
}