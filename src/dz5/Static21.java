package dz5;

public class Static21 {
    public static void main(String[] args) {
        Humans hum1 = new Humans("Jay", 25);
        String humName1 = hum1.getName();
        Humans.counter();
        hum1.print();
        Humans.printStatic();
        Humans hum2 = new Humans("Silent Bob", 26);
        String humName2 = hum2.getName();
        Humans.counter();
        hum1.print();
        hum2.print();
        Humans.printStatic();
    }
}

class Humans {
    private String name;
    private int age;
    private static int count;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(name + "  " + age + "  " + count);
    }

    public String getName() {
        return name;
    }

    public static int counter() {
        count++;
        return count;
    }

    public static void printStatic() {
        System.out.println("now " + count);
    }
}
