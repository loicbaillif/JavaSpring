package formatting;

public class PrintTitle {
    private static final int OUTPUT_WIDTH = 100;
    public static void printTitleLv1(String title) {
        // variables
        char fillChar = '*';

        // Print
        for (int i = 0; i < OUTPUT_WIDTH; i++) {
            System.out.print(fillChar);
        }
        System.out.println();

        for (int i = 0; i < OUTPUT_WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTitleLv2(String title) {

    }
}
