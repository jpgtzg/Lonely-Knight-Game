import java.util.Scanner;

public class App extends SystemSettings{
    //Dialogue variables

    static Scanner in = new Scanner(System.in);

    //Game Variables)
    static Player player;

    public static void main(String[] args) throws Exception 
    {
        clear();
        print("Welcome, player. What's your name?");
        player = new Player(in.nextLine(), 100, 100 );
        clear();
        player.getName();

        //Decision loop
        boolean decision = true;
        

        print("Excellent");
        //Decision loop
        decision = true;
        while(decision){
            print("Ready to play?(y/n)");
            String choice = in.nextLine();
            if(choice.equals("y"))
            {
                decision = false;
                Traebourne.main(null);
            }
            else if(choice.equals("n"))
            {
                decision = false;
                print("Goodbye.");
                Thread.sleep(1000);
                System.exit(0);
            }
            else
            {
                print("Please enter a valid choice.");
            }
        }
    }
}
