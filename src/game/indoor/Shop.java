/**
 * Written by Juan Pablo Gutiérrez
 */

package game.indoor;

import java.util.Random;

import gamemanager.Item;
import gamemanager.Player;
import system.ChoiceManager;
import utils.Constants.ShopConstants;

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

    public Shop(Player player, Personalities vendorPersonality) {
        super(player);

        this.vendorPersonality = vendorPersonality;
    }

    public void run() {
        for (int i = 0; i < productLists.length; i++) {
            productLists[i] = Item.generateRandomProduct(ShopConstants.names, ShopConstants.descriptions, ShopConstants.prices);
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
                () -> player.spendGp(productLists[randomIndexes[0]].getPrice(), productLists[randomIndexes[0]]),
                () -> player.spendGp(productLists[randomIndexes[1]].getPrice(), productLists[randomIndexes[1]]),
                () -> player.spendGp(productLists[randomIndexes[2]].getPrice(), productLists[randomIndexes[2]]));
    }

}
