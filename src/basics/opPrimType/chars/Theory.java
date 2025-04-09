package basics.opPrimType.chars;

// https://hyperskill.org/learn/step/3514

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Characters");

        char lowerCaseChar = 'g';
        char upperCaseChar = 'J';
        char numberChar = '3';
        char spaceChar = ' ';
        char dollarChar = '$';

        PrintTitle.printTitleLv2("Initializing characters with codes");
        char myChar1 = '\u0123';
        System.out.println(myChar1);
        char myChar2 = 64;
        System.out.println(myChar2);

        PrintTitle.printTitleLv1("End of Theory");
    }
}

