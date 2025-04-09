package basics.simpleProg.readScanner;

// https://hyperskill.org/learn/step/9055

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("Reading user's input with Scanner");
        System.out.println("**********\n");

        Scanner scanner = new Scanner(System.in);
        String user_name = scanner.next();
        System.out.println("Hello, " + user_name);


        scanner.close();

        System.out.println("\n**********");
        System.out.println("End of theory");
        System.out.println("**********\n");
    }
}
