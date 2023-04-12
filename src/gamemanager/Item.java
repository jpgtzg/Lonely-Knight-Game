/**
 * Written by Juan Pablo Gutiérrez
 */

package gamemanager;

import java.util.Random;

public class Item {

    private String name;
    private String description;
    private double price;

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\nPrice: " + price;
    }

    public static Item generateRandomProduct(String[] names, String[] descriptions, double[] prices) {
        Random random = new Random();

        int index = random.nextInt(names.length);
        String name = names[index];
        String description = descriptions[index];
        double price = prices[index];

        return new Item(name, description, price);
    }
}
