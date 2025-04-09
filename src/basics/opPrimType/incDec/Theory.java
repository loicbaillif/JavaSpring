package basics.opPrimType.incDec;

// https://hyperskill.org/learn/step/5008

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Increment and decrement");

        PrintTitle.printTitleLv2("Using ++ and -- in Java");
        int n = 10;
        System.out.println("n = " + n);
        n++;
        System.out.println("n++ ==> n = " + n);
        n--;
        System.out.println("n-- ==> n = " + n);

        n += 3;
        System.out.println("n += 3 == n = " + n);
        n -= 5;
        System.out.println("n -= 5 == n = " + n);

        PrintTitle.printTitleLv1("End of Theory");
    }
}
