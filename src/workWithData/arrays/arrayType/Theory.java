package workWithData.arrays.arrayType;

// https://hyperskill.org/learn/step/3511

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Array - Theory");

        PrintTitle.printTitleLv2("Declaration");
        int[] array; // Declaration

        PrintTitle.printTitleLv2("Instanciation");
        int[] numbersArray = {1, 3, 5, 7, 9};

        PrintTitle.printTitleLv2("Creating an array with new");
        int n = 5;
        int[] numbers2Array = new int[n];

        PrintTitle.printTitleLv1("End of theory");
    }
}
