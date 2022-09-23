package src.dz6;

public class Human implements Info {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("Hello!");
    }

    public void showAge() {
        System.out.println("I live : " + this.age + " years");
    }

    public void showInfo() {
        System.out.println("My name is : " + this.name);
    }
}
