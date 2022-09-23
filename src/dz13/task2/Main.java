package src.dz13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player music = new Player();
        int action = 0;
        Scanner scanner = new Scanner(System.in);
        while (action != 5) {
            System.out.println("1 - play ;  2 - stop ;  3 - pause ;  4 - record ;  5 - exit");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    music.play();
                    break;
                case 2:
                    music.stop();
                    break;
                case 3:
                    music.pause();
                    break;
                case 4:
                    music.record();
                    break;
                case 5:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid");
            }
        }
        scanner.close();
    }
}
