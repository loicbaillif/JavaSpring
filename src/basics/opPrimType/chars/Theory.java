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

        PrintTitle.printTitleLv2("Retrieving subsequent characters");
        char myChar3 = 'q';
        System.out.println("char = " + myChar3);
        myChar3 += 1;
        System.out.println("char += 1 => char = " + myChar3);
        myChar3 -= 3;
        System.out.println("char -= 3 => char = " + myChar3);
        myChar3 += 'a';
        System.out.println("char += 'a' => char = " + myChar3);

        PrintTitle.printTitleLv2("Escape sequences");
        System.out.println("\\n => " + "\n" + ".");
        System.out.println("\\t => " + "\t" + ".");
        System.out.println("\\r => " + "\r" + ".");
        System.out.println("\\\" => " + "\"" + ".");

        PrintTitle.printTitleLv1("End of Theory");
    }
}

