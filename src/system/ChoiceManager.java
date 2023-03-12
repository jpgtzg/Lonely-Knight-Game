package system;
import java.util.Scanner;

public class ChoiceManager extends SystemSettings {

    private static Scanner in = new Scanner(System.in);

    public static Runnable makeChoiceInt(String choiceText, Runnable... method1Runnables) {

        boolean decision = true;
        while (decision) {
            print(choiceText);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    decision = false;
                    method1Runnables[0].run();
                    break;
                case 2:
                    decision = false;
                    method1Runnables[1].run();
                    break;
                case 3:
                    decision = false;
                    method1Runnables[2].run();
                    break;

                default:
                    print("Please enter a valid choice");
                    break;
            }
        }

        return null;
    }

    public static Runnable makeChoiceYN(String choiceText, Runnable... method1Runnables) {

        boolean decision = true;
        while (decision) {
            print(choiceText);
            String choice = in.nextLine();

            switch (choice) {
                case "y":
                    decision = false;
                    method1Runnables[0].run();
                    break;
                case "n":
                    decision = false;
                    method1Runnables[1].run();
                    break;
                default:
                    print("Please enter a valid choice");
                    break;
            }
        }

        return null;
    }

}
