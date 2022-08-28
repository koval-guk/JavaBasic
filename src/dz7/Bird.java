package dz7;

public class Bird {
    int id;

    public Bird(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }

    void fly() {
        System.out.println(id + " flying");
    }
}
