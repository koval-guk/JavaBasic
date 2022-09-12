package dz10;

import java.io.Serializable;

public class Food implements Serializable {
    private static final long serialVersionUID = 6975322268710117268L;
    private String name;
    private double price;
    private transient int calories;

    public Food(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name + " coast - " + price + " and this is " + calories;
    }
}
