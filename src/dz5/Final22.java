package dz5;

public class Final22 {
    public static void main(String[] args) {
        String str1 = "строка";
        String str2 = " и строка";
        final int COUNT = 10;
        final String STR = str1+str2;
        System.out.println(Fin.CONSTINT);
        Fin.x();
        System.out.println(STR);
    }
}
class Fin{
    public static final int CONSTINT=10;
    private static final String CONSTSTR="два банана";

    public static void x(){
        System.out.println(CONSTSTR);

    }

}
