import java.util.Scanner;

public class App {
    //Dialogue variables

    static Scanner in = new Scanner(System.in);

    //Game Variables)
    static Player player;
    public static QuestManager questManager = new QuestManager();

    public static void main(String[] args) throws Exception {
        intro();
    }

    public static void intro() throws InterruptedException
    {
        clear();
        print("Welcome. What's your name? ");
        player = new Player(in.nextLine(), 1, 0, 100, 100);
        clear();
        player.status();
    }

    public static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void print(String text) throws InterruptedException
    {
        char chars[] = text.toCharArray();
        for (char letter : chars) {
            System.out.print(letter);
            Thread.sleep(50);
        }
        System.out.println("\n");  
    }
}
