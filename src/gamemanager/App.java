/**
 * Written by Juan Pablo Gutiérrez
 */

package gamemanager;
import java.util.Scanner;

import game.Traebourne;
import system.ChoiceManager;
import system.SystemSettings;

public class App extends SystemSettings {
    // Dialogue variables
    static Scanner in = new Scanner(System.in);

    // Game Variables
    public static Player player = new Player("Jack", 199, 199); //TODO DEBUG ONLY;

    public static void main(String[] args) {
        clear();
        print("Welcome, player. What's your name?");
        player = new Player(in.nextLine(), 100, 100);
        clear();
        player.getName();

        print("Excellent");
        // Decision loop
        ChoiceManager.makeChoiceYN("Ready to play?(y/n)",
                () -> {
                    Traebourne.main(null);
                }, () -> {
                    print("Goodbye.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.exit(0);
                });
        
    }
}
