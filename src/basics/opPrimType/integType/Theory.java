package basics.opPrimType.integType;

// https://hyperskill.org/learn/step/3565

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Integer types and operations");

        PrintTitle.printTitleLv2("Integer types: the basics");
        int two = 2;
        int ten = 10;

        int twelve = two + ten;
        int eight = ten - two;
        int twenty = ten * two;
        int five = ten / two;
        int four = twenty % eight;
        System.out.println(twelve);
        System.out.println(twenty);
        System.out.println(five);
        System.out.println(four);
        int minusTwo  = -two;
        System.out.println(minusTwo);

        int million = 1_000_000;

        long one = 1L;
        long bigLong = 100_000_000_000L;
        System.out.println(bigLong + one);
    }
}
