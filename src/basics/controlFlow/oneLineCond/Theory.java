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

        PrintTitle.printTitleLv2("Some examples");
        System.out.println((userAge % 2 == 0 ? "Even" : "Odd") + " age");
        String comparison = userAge == 25 ? "You are 25" :
                userAge > 25 ? "You are an adult" : "You are still young";
        System.out.println(comparison);

        PrintTitle.printTitleLv1("End of theory");
    }
}
