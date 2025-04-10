package basics.simpleProg.formatOut;

// https://hyperskill.org/learn/step/7046

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Formatted Output - Theory");

        PrintTitle.printTitleLv2("printf() introduction");
        System.out.printf("\tMy name is %s.\n\tI was born in %d.", "Paul", 1977);

        PrintTitle.printTitleLv1("End of Theory");
    }
}
