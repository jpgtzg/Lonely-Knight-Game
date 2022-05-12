import java.util.Scanner;

public class App extends SystemSettings{
    //Dialogue variables

    static Scanner in = new Scanner(System.in);

    //Game Variables)
    static Player player;
    public static QuestManager questManager = new QuestManager();

    public static void main(String[] args) throws Exception 
    {
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
}
