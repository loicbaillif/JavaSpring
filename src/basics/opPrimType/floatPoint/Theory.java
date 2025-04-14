package basics.opPrimType.floatPoint;

// https://hyperskill.org/learn/step/3517

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Floating-point types");

        PrintTitle.printTitleLv2("Declaring variables and assigning values");
        double zero = 0.0;
        double one = 1.0;
        double someNegDouble = -1.23;
        double pi = 3.141;

        double two = 2;
        System.out.println("zero = " + zero);
        System.out.println("one = " + one);
        System.out.println("someNegDouble = " + someNegDouble);
        System.out.println("pi = " + pi);
        System.out.println("two = " + two);

        float three = 3f;
        float four = 4.0f;
        System.out.println("three = " + three);
        System.out.println("four = " + four);
        float longDecimalPart = 1.23456789101112f;
        System.out.println("longDecimalPart = " + longDecimalPart);
        double longDecimalDouble = 1.23456789101112d;
        System.out.println("longDecimalDouble = " + longDecimalDouble);


        PrintTitle.printTitleLv1("End of theory");
    }
}
