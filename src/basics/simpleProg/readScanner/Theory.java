package basics.simpleProg.readScanner;

// https://hyperskill.org/learn/step/9055

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("Reading user's input with Scanner");
        System.out.println("**********\n");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        String userLastName = scanner.next();
        System.out.println("Hello, " + userName + " " + userLastName);


        scanner.close();

        System.out.println("\n**********");
        System.out.println("End of theory");
        System.out.println("**********\n");
    }
}
