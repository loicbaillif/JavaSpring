package basics.controlFlow.forLoop;

// https://hyperskill.org/learn/step/3505

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("for loop - Theory");

        int nbRepetitions = 5;
        for (int i = 0; i < nbRepetitions; i++) {
            System.out.println("Repetition " + i);
        }

        int startNumber = 8;
        for (int i = startNumber; i < startNumber + nbRepetitions; i++) {
            System.out.printf("\tStart at %d - repetition %d - value = %d%n", startNumber, (i - startNumber), i);
        }

        PrintTitle.printTitleLv1("End of theory");
    }
}
