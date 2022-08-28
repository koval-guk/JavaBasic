package dz4;

public class Parametrs {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        man1.ageAndName(22, "Коля");
        man2.ageAndName(35, "Маша");
        man1.say();
        man2.say();
    }
}

class Man {
    int age;
    String name;

    void ageAndName(int tAge, String tName) {
        age = tAge;
        name = tName;
    }

    void say() {
        System.out.println(age + "  " + name);
    }
}
