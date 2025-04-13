package basics.opPrimType.arithOper;

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Arithmetic Operations - Theory");

        PrintTitle.printTitleLv2("Binary Arithmetic operators");
        System.out.println(12 + 34);
        System.out.println(35 + 753);

        System.out.println(34 - 12);
        System.out.println(35 - 753);

        System.out.println(15*32);
        System.out.println(6 * 6 * 6);

        System.out.println(15 / 4);
        System.out.println(17 / 4);

        System.out.println(15 % 4);
        System.out.println(17 % 4);

        PrintTitle.printTitleLv2("Writing complex expressions");
        System.out.println("1 + 2 * 3 - 4 = " + (1 + 2 * 3 - 4));
        System.out.println("(1 + 2) * 3 - 4 = " + ((1 + 2) * 3 - 4));

        PrintTitle.printTitleLv2("Unary operators");
        System.out.println(+3);
        System.out.println(-14);
        System.out.println(-(165-6));

        PrintTitle.printTitleLv1("End of theory");
    }
}
