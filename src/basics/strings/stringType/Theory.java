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
        String someString4 = "     This is ridiculous       ";
        String someString5 = someString4.trim();

        System.out.println();
        System.out.println(someString1 + ".length() = " + someString1.length());
        System.out.println(someString2 + ".length() = " + someString2.length());
        System.out.println(someString3 + ".length() = Exception error (null has no length)");

        System.out.println("\n" + someString1 + ".charAt(3) = " + someString1.charAt(3));

        PrintTitle.printTitleLv2("Useful methods of strings");
        System.out.println("\t" + someString1 + ".isEmpty() = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".toUpperCase() = " + someString1.toUpperCase());
        System.out.println("\t" + someString1 + ".toLowerCase() = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".startsWith(\"Thi\") = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".endsWith(\"ign\") = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".contains(\"is \") = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".toLowerCase() = " + someString1.isEmpty());
        System.out.println("\t" + someString1 + ".replace() = " + someString1.replace("s", "d"));
        System.out.println("\t" + someString1 + ".replaceAll(\"^.h\", \"Z\") = " + someString1.replaceAll("^.h", "Z"));
        System.out.println("\t`" + someString4 + "`.trim() = " + someString5);

        PrintTitle.printTitleLv2("Exceptions when processing strings");
        try {
            System.out.println(someString3.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(someString1.charAt(33));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        PrintTitle.printTitleLv1("End of Theory");
    }
}
