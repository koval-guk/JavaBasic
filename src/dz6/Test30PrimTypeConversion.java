package dz6;

public class Test30PrimTypeConversion {
    public static void main(String[] args) {
        byte byteX = 11;
        short shortX = 222;
        int intX = 333333333;
        long longX = 9999999999999L;
        float floatX = 44444.5555F;
        double doubleX = 666666.777777;
        System.out.println("Явное привидение");
        int a=(int)doubleX;
        long b=(long)floatX;
        short c = (short) intX;
        System.out.println(a+" "+b+" "+c+" "+Math.round(doubleX));
        System.out.println("Неявное привидение");
        int d = byteX;
        double e = floatX;
        float f = shortX;
        double g = longX;
        System.out.println(d+" "+e+" "+f+" "+g);


    }
}
