package basics.controlFlow.switchStatement;

// https://hyperskill.org/learn/step/3504

import formatting.PrintTitle;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Switch Statement - Theory");

        PrintTitle.printTitleLv2("Three keywords: switch, case, default");
        System.out.println("new? load? help? quit?");
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean validChoice = false;
        while (!validChoice) {
            userChoice = scanner.nextLine();
            switch (userChoice) {
                case "new":
                    System.out.println("Creating a new game.");
                    validChoice = true;
                    break;
                case "load":
                    System.out.println("Loading a game.");
                    validChoice = true;
                    break;
                case "help":
                    System.out.println("Let's repeat the tutorial...");
                    validChoice = true;
                    break;
                case "quit":
                    System.out.println("Thank you for using our program.");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice, could you repeat please?");
            }
        }

        scanner.close();

        PrintTitle.printTitleLv1("End of theory");
    }
}
