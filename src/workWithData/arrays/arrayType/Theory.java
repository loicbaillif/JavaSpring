package workWithData.arrays.arrayType;

// https://hyperskill.org/learn/step/3511

import formatting.PrintTitle;

import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Array - Theory");

        PrintTitle.printTitleLv2("Declaration");
        int[] array; // Declaration

        PrintTitle.printTitleLv2("Instanciation");
        int[] numbersArray = {10, 30, 5, 7, 9, 11, 13};

        PrintTitle.printTitleLv2("Creating an array with new");
        int n = 10;
        int[] numbers2Array = new int[n];

        float[] floatArray;
        floatArray = new float[] { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f };

        char[] charArray = new char[n];
        int index = 0;
        Arrays.fill(charArray, 0, n / 2, (char) (10 * numbersArray[index++]));
        Arrays.fill(charArray, n / 2, n, (char) (8 * numbersArray[index]));
        System.out.println(Arrays.toString(charArray));

        PrintTitle.printTitleLv1("End of theory");
    }
}
