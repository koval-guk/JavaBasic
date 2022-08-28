package dz4;

public class Constructer {
    public static void main(String[] args) {
        Car car1 = new Car("red", 13, true);
        System.out.println(car1.color);
    }
}

class Car {
    String color;
    int age;
    boolean crash;

    public Car() {
        System.out.println("none");
    }

    public Car(int age) {
        this.age = age;
        System.out.println("you input only age");
    }

    public Car(String color, int age, boolean crash) {
        this.color = color;
        this.age = age;
        this.crash = crash;
        System.out.println("all");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCrash(boolean crash) {
        this.crash = crash;
    }

    public String getColor() {
        return color;
    }
}
