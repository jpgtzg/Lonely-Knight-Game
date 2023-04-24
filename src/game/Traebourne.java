/**
 * Written by Juan Pablo Gutiérrez
 */

package game;

import java.util.Scanner;

import game.indoor.Shop;
import game.indoor.Shop.Personalities;
import gamemanager.App;
import gamemanager.Player;
import system.ChoiceManager;
import system.SystemSettings;

public class Traebourne extends SystemSettings {

    // Dialogue Variables
    private static Scanner in = new Scanner(System.in);

    // Game variables
    private static Player player = App.player;

    private static Shop tShop;

    public static void main(String[] args) {
        tShop = new Shop(player, Personalities.OLD);
        
        clear();
        print("You are in Traebourne Town."
                + "\nIn front of you, there's a sign that reads 'Traebourne Inn'."
                + "\nAt your left there's a sign that reads 'Traebourne Local Shop'."
                + "\nAt your right there's a sign that reads 'Traebourne Armory'.");

        ChoiceManager.makeChoiceInt("Where would you like to go? "
                + "\n 1. Inn"
                + "\n 2. Shop"
                + "\n 3. Armory", () -> {
                    inn();
                }, () -> {
                    shop();
                }, () -> {
                    armory();
                });
    }

    private static void inn() {
        print("You enter the Inn. The Innkeeper greets you.\nThe Inn is built out of wood and stone.\nThere are not many people inside. A small fireplace is at your left, with 3 people talking around it");
    }

    private static void shop() {
        tShop.run();
        // TODO add shop
    }

    private static void armory() {
        System.out.println("Hello");
        // TODO add armory
    }
}
