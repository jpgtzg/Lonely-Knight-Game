/**
 * Written by Juan Pablo Gutiérrez
 */

package system;

import java.util.Scanner;

public class ChoiceManager extends SystemSettings {

    private static Scanner in = new Scanner(System.in);

    public static Runnable makeChoiceInt(String choiceText, Runnable... method1Runnables) {
        print("");
        print("Press enter to continue");
        in.nextLine();

        boolean decision = true;
        while (decision) {
            print(choiceText);
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    print("");
                    decision = false;
                    method1Runnables[0].run();
                    break;
                case 2:
                    print("");
                    decision = false;
                    method1Runnables[1].run();
                    break;
                case 3:
                    print("");
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
        print("");
        print("Press enter to continue");

        in.nextLine();

        boolean decision = true;
        while (decision) {
            print(choiceText);
            String choice = in.nextLine();

            switch (choice) {
                case "y":
                    print("");
                    decision = false;
                    method1Runnables[0].run();
                    break;
                case "n":
                    print("");
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

    public static Runnable makeChoiceSentiment(String choiceText, Runnable... method1Runnables) {
        print("");
        in.nextLine();

        boolean decision = true;
        while (decision) {
            print(choiceText);
            String choice = in.nextLine();

            switch (choice) {
                case "Good":
                    print("");
                    decision = false;
                    method1Runnables[0].run();
                    break;
                case "Bad":
                    print("");
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
