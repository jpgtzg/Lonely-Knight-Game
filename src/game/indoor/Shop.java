/**
 * Written by Juan Pablo Gutiérrez
 */

package game.indoor;

import java.util.Random;

import gamemanager.Item;
import gamemanager.Player;
import system.ChoiceManager;

public class Shop extends IndoorPlace {

    public enum Personalities {
        OLD,
        NEUTRAL,
        ANGRY,
        HAPPY,
    }

    private Personalities vendorPersonality;

    private Item[] productLists = new Item[10];

    private Random ran = new Random();

    String[] names = { "Sword of Destiny", "The Wand of Power", "Legendary Bow", "Magic Tome", "Dragon's Scale Armor",
            "Elven Cloak", "Ancient Staff", "Enchanted Shield", "Crystal Orb", "Mystic Robe" };
    String[] descriptions = { "A powerful weapon forged by the gods themselves",
            "Unleash your magic with this wand of immense power", "The perfect bow for any skilled archer",
            "A book of ancient spells and knowledge", "Armor made from the scales of a dragon",
            "A cloak woven by elven weavers from the finest materials", "A staff imbued with ancient magic",
            "A shield that can deflect any attack", "A crystal orb that reveals hidden secrets",
            "A robe infused with mystical energies" };
    double[] prices = { 29.99, 49.99, 99.99, 149.99, 199.99, 249.99, 299.99, 349.99, 399.99, 449.99 };

    public Shop(Player player, Personalities vendorPersonality) {
        super(player);

        this.vendorPersonality = vendorPersonality;
    }

    public void run() {
        for (int i = 0; i < productLists.length; i++) {
            productLists[i] = Item.generateRandomProduct(names, descriptions, prices);
        }

        switch (vendorPersonality) {
            case OLD:
                runOld();
                break;
            case ANGRY:
                break;
            case HAPPY:
                break;
            case NEUTRAL:
                break;
            default:
                break;

        }
    }

    public void runOld() {
        clear();

        if (firstTime) {
            print("OLD VENDOR: Welcome kid, you seem new to this town");
            ChoiceManager.makeChoiceSentiment("How are you?",
                    () -> print("Happy to know, and nice to meet you. I'm always here if you need anything\n"),
                    () -> print("Mmmm, that's too bad. Let's hope I have what you're looking for\n"));
            firstTime = false;
        } else {
            print("Welcome back, " + player.getName()
                    + "\nReady for some adventures?\nHere are some brand new Items you might want to take a look at\n");
        }
        print("Here are some brand new items you might want to take a look at, though they have a price");
        int[] randomIndexes = new int[3];
        for (int i = 0; i < 3; i++) {
            int index = ran.nextInt(productLists.length);
            print(productLists[index].toString());
        }

        ChoiceManager.makeChoiceInt("Choose an item",
                () -> player.addItem(productLists[randomIndexes[0]]),
                () -> player.addItem(productLists[randomIndexes[1]]),
                () -> player.addItem(productLists[randomIndexes[2]]));
    }

}
