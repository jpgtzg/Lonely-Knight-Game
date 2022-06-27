import java.util.Scanner;

public class Traebourne extends SystemSettings {

    // Dialogue Variables
    static Scanner in = new Scanner(System.in);

    // Game variables
    static Player player = App.player;

    public static void main(String[] args) throws InterruptedException {
        clear();
        print("You are in Traebourne Town."
                + "\nIn front of you, there's a sign that reads 'Traebourne Inn'."
                + "\nAt your left there's a sign that reads 'Traebourne Local Shop'."
                + "\nAt your right there's a sign that reads 'Traebourne Armory'.");

        // Decision loop
        boolean decision = true;
        while (decision) {
            print("Where would you like to go? "
                    + "\n 1. Inn"
                    + "\n 2. Shop"
                    + "\n 3. Armory");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    decision = false;
                    inn();
                    break;
                case 2:
                    decision = false;
                    shop();
                    break;
                case 3:
                    decision = false;
                    armory();
                    break;
                default:
                    print("Please enter a valid choice.");
                    break;
            }
        }

    }

    private static void inn() throws InterruptedException {
        print("You enter the Inn. The Innkeeper greets you.\nThe Inn is built out of wood and stone.");
    }

    private static void shop() {
        // TODO add shop
    }

    private static void armory() {
        // TODO add armory
    }
}
