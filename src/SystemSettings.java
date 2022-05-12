/* 
 * Manages system methods, settings 
 * and game data
*/

public class SystemSettings {

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
