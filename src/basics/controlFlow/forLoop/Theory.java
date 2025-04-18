package basics.controlFlow.forLoop;

// https://hyperskill.org/learn/step/3505

import formatting.PrintTitle;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("for loop - Theory");

        PrintTitle.printTitleLv2("Basic syntax");
        int nbRepetitions = 5;
        for (int i = 0; i < nbRepetitions; i++) {
            System.out.println("Repetition " + i);
        }

        int startNumber = 8;
        for (int i = startNumber; i < startNumber + nbRepetitions; i++) {
            System.out.printf("\tStart at %d - repetition %d - value = %d%n", startNumber, (i - startNumber), i);
        }

        PrintTitle.printTitleLv2("Skipping parts");

        for (; nbRepetitions > 0; nbRepetitions--) {
            System.out.println("Skipping the initial declaration");
        }
        Scanner scanner = new Scanner(System.in);
        for (;;) {  // Infinite loop
            if ("exit".equals(scanner.nextLine())) {
                break;
            }
        }

        PrintTitle.printTitleLv2("Nested loops");
        System.out.println((int) 'A');  // 65
        for (int i = 1; i < 10; i++) {
            for (int j = (int) 'A'; j <= (int) 'Z'; j++) {
                System.out.printf("%d%c ", i, (char) j);
            }
            System.out.println();
        }

        scanner.close();

        PrintTitle.printTitleLv1("End of theory");
    }
}
