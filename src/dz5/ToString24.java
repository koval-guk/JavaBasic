package dz5;

public class ToString24 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",13);
        System.out.println(human1.toString());
        System.out.println(human1.hashCode());
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return age+" years old, and named "+name;
    }
    public int hashCode(){
        return age*2;
    }
}