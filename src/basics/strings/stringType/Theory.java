package basics.strings.stringType;

// https://hyperskill.org/learn/step/3523

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("String - Theory");

        PrintTitle.printTitleLv2("The String type");
        String someString1 = "This is a String";
        System.out.println(someString1);
        String someString2 = "This\nis\nmultiline\nstring";
        System.out.println(someString2);
        String someString3 = null;
        System.out.println(someString3);

        PrintTitle.printTitleLv1("End of Theory");
    }
}
