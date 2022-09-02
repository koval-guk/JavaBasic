package dz3;

public class ClassesObjectsAndMetods {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        Cats cat2 = new Cats();
        Cats cat3 = new Cats();
        cat1.name = "Beagle";
        cat2.name = "Archi";
        cat3.name = "Jaya";
        cat1.color = "Red";
        cat2.color = "Gray";
        cat3.color = "Black/Gray";
        cat1.numOfPaws = 4;
        cat2.numOfPaws = 3;
        cat3.numOfPaws = 0;
        cat1.goOut();
        cat2.goOut();
        cat3.sayMeow();
    }
}
class Cats {
    String name;
    String color;
    int numOfPaws;

    void sayMeow() {
        System.out.println(name + " say : MEOW!!!");
    }

    void goOut() {
        if (numOfPaws == 4) {
            System.out.println(color + " cat " + name + " run away!");
        } else {
            System.out.println(color + " cat " + name + " remained in place, cause he hase only " + numOfPaws + " paws.");
        }
    }
}