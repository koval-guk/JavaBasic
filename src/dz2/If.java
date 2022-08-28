package dz2;

public class If {
    public static void main(String[] args) {
        //Почем колбаса?
        int price = 124;
        if (price > 124) {
            System.out.println("Дороговато");
        } else if (price < 124) {
            System.out.println("Как-то дешево");
        } else if (price == 124) {
            System.out.println("Вот прям как в магазине");
        }
    }
}
