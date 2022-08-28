package dz1;

public class Name10Times {
    public static void main(String[] args) {

        String sp=" ";
        String name="Koval-Guk Vitaly";


        for( int i = 1 ; i <= 9; i++) {

            System.out.println(i + sp + sp + name);
        }
        int t = 10;
        System.out.println(t + sp + name);
    }
}