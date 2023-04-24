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

    public Player(String name , int hp, int maxHp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void status() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("Max HP: " + this.maxHp);
    }

    /* Money */
    public double getGp(){
        return gp;
    }

    public boolean spendGp(double cost){
        if(gp >= cost){
            gp =- cost;
            return true;
        }
        return false;
    }

    /* Inventory */
    public void addItem(Item item){
        inventory.add(item);
    }

    public String getInventory(){
        String res = "";

        for (Item item : inventory) {
            res += item.toString();
        }
        return res;
    }
}
