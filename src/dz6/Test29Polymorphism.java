package src.dz6;

public class Test29Polymorphism {
    public static void main(String[] args) {
        Music music = new Music();
        HardRock hardRock = new HardRock();
        Pop pop = new Pop();
        music.play();
        hardRock.play();
        pop.play();
        System.out.println("********");
        play(music);
        play(hardRock);
        play(pop);
    }

    public static void play(Music music) {
        music.play();
    }
}
