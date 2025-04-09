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

        PrintTitle.printTitleLv2("The forms of the assignment operator");
        int n = 123;
        System.out.println("n = " + n);
        n = n + 4;
        System.out.println("n = n + 4 ==> n = " + n);
        n += 4;
        System.out.println("n = " + n);
        n -= 31;
        System.out.println("n = " + n);
        n /= 25;
        System.out.println("n = " + n);
        n *= 3;
        System.out.println("n = twelve => " + (n == twelve));
    }
}
