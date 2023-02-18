package system;
/**
 * Manages system methods, settings 
 * and game data
*/
public class SystemSettings {

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void print(String text) {
        char chars[] = text.toCharArray();
        for (char letter : chars) {
            System.out.print(letter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\n");
    }
}
