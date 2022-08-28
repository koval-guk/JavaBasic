package dz2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ НОВЫЙ ПАРОЛЬ (8 знаковб 2 цифрыб регистр и тд...)");
        String pass = s.nextLine();
        // на этом месте дожен был быть клир. почитал. немного расстроился
        System.out.println("ПОДТВЕРДИТЕ ПАРОЛЬ");
        String pass2 = p.nextLine();
        if (pass.equals(pass2)) {
            System.out.println("Пароль принят!     начинаем взлом соцсетей......");
        } else {
            System.out.println("Ошибка ввода!");
        }
    }
}
