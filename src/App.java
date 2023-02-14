import java.util.Scanner;

public class App extends SystemSettings {
    // Dialogue variables
    static Scanner in = new Scanner(System.in);

    // Game Variables
    static Player player;

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
