package workWithData.arrays.arrayType;

// https://hyperskill.org/learn/step/3511

import formatting.PrintTitle;

import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Array - Theory");

        PrintTitle.printTitleLv2("Declaration");
        int[] array; // Declaration
        array = new int[10];
        array[3] = 9;
        System.out.println(Arrays.toString(array));

        PrintTitle.printTitleLv2("Instanciation");
        int[] numbersArray = {10, 30, 5, 7, 9, 11, 13};

        PrintTitle.printTitleLv2("Creating an array with new");
        int n = 10;
        int[] numbers2Array = new int[n];
        System.out.println(numbers2Array.length);

        float[] floatArray;
        floatArray = new float[] { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f };
        System.out.println(Arrays.toString(floatArray));

        char[] charArray = new char[n];
        int index = 0;
        Arrays.fill(charArray, 0, n / 2, (char) (10 * numbersArray[index++]));
        Arrays.fill(charArray, n / 2, n, (char) (8 * numbersArray[index]));
        System.out.println(Arrays.toString(charArray));

        PrintTitle.printTitleLv2("Array length");
        System.out.println(numbersArray.length);

        PrintTitle.printTitleLv2("Accessing elements");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.printf("\t- index %d => array[i] = %d\n", i, numbersArray[i]);
        }

        byte test = 4;
        System.out.println(numbersArray[test]);

        PrintTitle.printTitleLv1("End of theory");
    }
}
