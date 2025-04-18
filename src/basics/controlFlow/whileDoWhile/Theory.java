package basics.controlFlow.whileDoWhile;

// https://hyperskill.org/learn/step/3498

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("while and do-while loops - theory");

        PrintTitle.printTitleLv2("The while loop");
        int i = 0;
        while (i < 10) {
            System.out.println("\t- " + i);
            i++;
        }

        char alphabetLetter = 'z';
        while (alphabetLetter >= 'a') {
            System.out.println("\t- " + alphabetLetter);
            alphabetLetter--;
        }

        PrintTitle.printTitleLv2("The do-while loop");

        alphabetLetter = 'Z';
        do {
            System.out.printf("%c ", alphabetLetter--);
        } while (alphabetLetter >= 'A');
        System.out.println();

        PrintTitle.printTitleLv1("End of theory");
    }
}
