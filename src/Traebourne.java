import java.util.Scanner;

public class Traebourne extends SystemSettings {

    // Dialogue Variables
    static Scanner in = new Scanner(System.in);

    // Game variables
    //static Player player = App.player;
    static QuestManager questManager = App.questManager;
    final static QuestModel questModel = new QuestModel();

    public static void main(String[] args) throws InterruptedException {
        clear();
        townSquare.hoodedMan();
        print("You are in the town of Traebourne."
                + " This city is a place of great adventure and mystery."
                + " It was founded a long time ago by a great wizard named Traebourne.");

        print("You see a sign that says 'Traebourne Town Square'."
                + "\nAt your left there's a sign that says 'Traebourne Tavern'."
                + "\nAt your right there's a sign that says 'Traebourne Armory'.");
        boolean decision = true;

        // Decision loop
        while (decision) {
            print("Where would you like to go? "
                    + "\n 1. Town Square "
                    + "\n 2. Tavern "
                    + "\n 3. Armory");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    decision = false;
                    townSquare.start();
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
                    print("Please enter a valid choice.");
                    break;
            }
        }
    }

    private static void armory() {
        // TODO add armory
    }

    private static void tavern() {
        // TODO add tavern
    }

    /* Town Square */
    private class townSquare {

        public static void start() throws InterruptedException {
            clear();
            print("You are now in the town square."
                    + "\nThere are few people around you. It is a cloudy day. It appears it will soon rain"
                    + "\nAt the center there's a fountain with a strange man, hooded. No one is near him"
                    + "\nThere's a shop at your left, it appears it sells food"
                    + "\nAt your right there's the town inn");

            print("What do you do? "
                    + "\n 1. Approach man "
                    + "\n 2. Go into the shop "
                    + "\n 3. Go into the Inn "
                    + "\n 4. Go back");
            int choice = in.nextInt();
            switch (choice) {
                // TODO FINISH THIS
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

        private static void hoodedMan() throws InterruptedException {
            Player player = new Player("Juan Pablo", 1, 0, 100, 100);
            // TODO FINISH THIS
            print("You approach the hooded man"
                    + "\nYou stare at him for a couple of seconds"
                    + "\nYou start the conversation\n"
                    + "\n- You: Who are you?"
                    + "\n- Hooded man: Who's asking?"
                    + "\n- You: You don't seem from around here, you seem, distant, like you don't quite fit"
                    + "\n- Hooded man: Hmmmm, you're quite smart for being here, but you've got most of it wrong. All right, I'll tell you a little bit about myself. But first, I need to know your name."
                    + "\n- You: Why would you need to know my name?"
                    + "\n- Hooded man: I need to know who I'm speaking with"
                    + "\n- You: I'm " + player.getName()
                    + "\n- Hooded man: Thanks for that " + player.getName() + ", I'm glad to meet you."
                    + "\n- You: Now's your turn, who are you?"
                    + "\n- Hooded man: Not now, kid. First I need you to help me"
                    + "\n- You: Wha.. What do you need help with?"
                    + "\n- Hooded man: I need to get my old sword."
                    + "\n- You: Why?."
                    + "\n- Hooded man: You see, I was once a mighty figher, but I lost it long ago"
                    + "\n- You: Hmmm... Okay then... I'll get it for you, but I need to know more about you"
                    + "\n- Hooded man: Sure, I'll also give you some coins as a better incentive"
                    + "\n- You: Well, that's better"
                    + "\n\nNEW QUEST OBTAINED");
            questManager.addQuest(questModel.searchQuest(0));
            questManager.showQuests();
            
        }
    }
    /* END Town Square */
}
