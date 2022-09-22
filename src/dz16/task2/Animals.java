package dz16.task2;

enum Animals {
    DOG(5),
    CAT(3),
    GOAT(2),
    RACOON(4);

    private int age;
    private String name;

    Animals(int age) {
        this.age = age;
        name = name();
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

class Main {
    public static void main(String[] args) {
        Animals cat = Animals.CAT;
        System.out.println(cat);
    }
}