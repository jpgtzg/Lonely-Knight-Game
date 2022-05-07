import java.util.Scanner;

public class Traebourne {
    
    //Dialogue Variables
    static Scanner in = new Scanner(System.in);
    
    //Game variables
    static QuestManager questManager = App.questManager;
    

    public static void main(String[] args) throws InterruptedException {
        App.clear();
        App.print("You are in the town of Traebourne."
        + " This city is a place of great adventure and mystery."
        + " It was founded a long time ago by a great wizard named Traebourne.");

        App.print("You see a sign that says 'Traebourne Town Square'."
        + "\nAt your left there's a sign that says 'Traebourne Tavern'."
        + "\nAt your right there's a sign that says 'Traebourne Armory'.");
        boolean decision = true;

        //Decision loop
        while(decision)
        {
            App.print("Where would you like to go? \n 1. Town Square \n 2. Tavern \n 3. Armory");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    decision = false;
                    townSquare();
                    break;
                case 2:
                    decision = false;
                    tavern();
                    break;
                case 3:
                    decision = false;
                    armory();
                    break;
                default:
                    App.print("Please enter a valid choice.");
                    break;
            }
        }
    }

    private static void armory() {
    }

    private static void tavern() {
    }

    public static void townSquare() throws InterruptedException{
        App.clear();
        App.print("You are now in the town square. \nThere are a few people around you. It is a cloudy day. It appears it will soon rain \nAt the center there's a fountain with a strange man, hooded. No one is near him\nThere's a shop at your left, it appears it sells food\nAt your right there's the town inn");
        App.print("What do you do? \n 1. Approach man \n 2. Go into the shop \n 3. Go into the Inn \n 4. Go back");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                hoodedMan();
                break;

            case 2:

                break;

            case 3:

                break;
            case 4:
                main(null);
                break;
        }

    }
    
    private static void hoodedMan() {
        //TODO Performane issues with this method
        Quest hoodedQuest = new Quest(1, "A tricky business", "You must obtain a sword for the hooded man", 5);
        questManager.addQuest(hoodedQuest);
        questManager.showQuests();
    }

    /* END Town Square */ 
}
