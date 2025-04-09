package basics.simpleProg.readScanner;

// https://hyperskill.org/learn/step/9055

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("Reading user's input with Scanner");
        System.out.println("**********\n");

        Scanner scanner = new Scanner(System.in);
        /*
        String userName = scanner.next();
        String userLastName = scanner.next();
        System.out.println("Hello, " + userName + " " + userLastName + ".\nWhat is your wish?");
         */
        String userWish = scanner.nextLine();
        System.out.println("Consider '" + userWish + "' as my command.");

        // Integer
        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        if (userAge < 18) {
            System.out.println("You are not 18 yet, you should leave.");
        } else {
            System.out.println("Welcome.");
        }

        // Double
        System.out.println("\nGive me a value for pi");
        double userPi = scanner.nextDouble();
        System.out.println("pi = " + userPi + " according to you.");


        scanner.close();

        System.out.println("\n**********");
        System.out.println("End of theory");
        System.out.println("**********\n");
    }
}
