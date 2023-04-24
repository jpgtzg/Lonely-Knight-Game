/**
 * Written by Juan Pablo Gutiérrez
 */

package gamemanager;

import java.util.ArrayList;

public class Player {

    private String name;
    private int hp;
    private int maxHp;
    private double gp;

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public Player(String name, int hp, int maxHp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    /**
     * Gets the {@link Player}'s name'
     * 
     * @return Player name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Player}'s name'
     * 
     * @param name New player name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the {@link Player}'s current HP'
     * 
     * @return Current HP
     */
    public int getHp() {
        return hp;
    }

    /**
     * 
     * Takes damage from the {@link Player}
     * 
     * @param damage Damage taken
     * @return True if player is still alive, False if player is dead (Hp equals to
     *         0)
     */
    public boolean takeDamage(int damage) {
        if (damage > hp) {
            hp = 0;
            return false;
        }
        hp -= damage;
        return true;
    }

    /* Money */
    /**
     * Gets the current GP
     * 
     * @return Current GP
     */
    public double getGp() {
        return gp;
    }

    /**
     * Substracts the cost from the gp
     * 
     * @param cost Product Cost
     * @return True if money is available, false otherwise
     */
    public boolean spendGp(double cost) {
        if (gp >= cost) {
            gp = -cost;
            return true;
        }
        return false;
    }

    /**
     * Substracts the cost from the gp, and adds and item to the inventory
     * 
     * @param cost Product Cost
     * @param item Item toa add
     * @return True if money is available, false otherwise
     */
    public boolean spendGp(double cost, Item item) {
        if (gp >= cost) {
            gp = -cost;
            addItem(item);
            return true;
        }
        return false;
    }

    /* Inventory */
    /**
     * Manually adds an item to the inventory
     * 
     * @param item Item to add
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Removes a specific item from the inventory
     * 
     * @param itemName Item name to remove
     */
    public void spendItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equals(itemName)) {
                inventory.remove(item);
            }
        }
    }

    /**
     * Returns the entire inventory
     * 
     * @return Inventory string
     */
    public String getInventory() {
        String res = "";

        for (Item item : inventory) {
            res += item.toString();
        }
        return res;
    }
}
