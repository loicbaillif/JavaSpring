package basics.controlFlow.condStatement;

// https://hyperskill.org/learn/step/3503

import formatting.PrintTitle;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Conditional statement - Theory");

        PrintTitle.printTitleLv2("Single if-case");
        Scanner scanner = new Scanner(System.in);
        int user_age = scanner.nextInt();
        if (user_age < 18) {
            System.out.println("You are less than 18 years old");
        }

        PrintTitle.printTitleLv2("if-else case");
        if (user_age < 65) {
            System.out.println("Too young to retire");
        } else {
            System.out.println("Time to cruise, Tom.");
        }

        PrintTitle.printTitleLv2("if-else-if cases");
        if (user_age % 10 == 0) {
            System.out.println("You just entered a new decade");
        } else if (user_age < 10) {
            System.out.println("Hi kid; how are you doing?");
        } else {
            System.out.println("yeah ... no big deal here.");
        }

        scanner.close();

        PrintTitle.printTitleLv1("End of Theory");
    }
}
