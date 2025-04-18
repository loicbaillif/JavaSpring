package basics.controlFlow.oneLineCond;

// https://hyperskill.org/learn/step/3506

import formatting.PrintTitle;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("One-line condition with ternary operator");

        PrintTitle.printTitleLv2("First usage");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        String greetings = userAge > 18? "Welcome dear user" : "Yo user!";
        System.out.println(greetings);

        PrintTitle.printTitleLv1("End of theory");
    }
}
