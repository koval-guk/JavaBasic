package dz7;

interface BirdDo {
    void fly();

    void Swim();
}

public class Test35AnonymousClasses {
    public static void main(String[] args) {
        Duck duck = new Duck(111) {
            @Override
            void quack() {
                System.out.println("anonymous quack");
            }
        };
        duck.quack();
        duck.fly();
        BirdDo birdDo = new BirdDo() {
            @Override
            public void fly() {
                System.out.println("anonymous bird fly");
            }

            @Override
            public void Swim() {
                System.out.println("anonymous bird swim");
            }
        };
        birdDo.fly();
        birdDo.Swim();
    }
}
