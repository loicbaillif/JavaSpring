package basics.opPrimType.floatPoint;

// https://hyperskill.org/learn/step/3517

import formatting.PrintTitle;

import java.util.Scanner;

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

        double five = 5e-3;
        double six = 0.6e1;
        System.out.println("five = " + five);
        System.out.println("six = " + six);

        PrintTitle.printTitleLv2("Arithmetic operations");
        System.out.println("one + pi = " + (one + pi));
        System.out.println("two * longDecimalPart = " + two * longDecimalPart);
        System.out.println("\t4 / 3 = " + (4 / 3));
        System.out.println("\t4.0 / 3 = " + (4.0 / 3));

        PrintTitle.printTitleLv2("Errors during computations");
        System.out.println("3.3 / 3 = " + (3.3 / 3));
        System.out.println("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " +
                (0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1));

        System.out.println("Reading float-point numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle base?");
        float base = scanner.nextFloat();
        System.out.println("Triangle height?");
        double height = scanner.nextDouble();
        System.out.println("Triangle area = " + (base * height / 2));

        PrintTitle.printTitleLv1("End of theory");
    }
}
