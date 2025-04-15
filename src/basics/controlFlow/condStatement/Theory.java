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


        scanner.close();

        PrintTitle.printTitleLv1("End of Theory");
    }
}
