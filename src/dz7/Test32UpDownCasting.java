package dz7;

public class Test32UpDownCasting {
    public static void main(String[] args) {
        System.out.println("***** normal");
        Bird bird = new Bird(1);
        bird.fly();
        Duck duck = new Duck(2);
        duck.fly();
        duck.quack();
        System.out.println("***** up casting");
        Bird bird1 = duck;
        bird1.fly();
        System.out.println("***** low casting");
        Duck duck2 = (Duck) bird1;
        duck2.fly();
        duck2.quack();

    }
}
