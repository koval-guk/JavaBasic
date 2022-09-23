package src.dz16.task1;

interface AbleToEat {
    void eat();
}

class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("someone is eating...");
            }
        };
        ableToEat.eat();
    }
}

