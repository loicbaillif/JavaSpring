package formatting;

public class PrintTitle {
    private static final int OUTPUT_WIDTH = 100;
    private static final char FILL_CHAR = '*'

    public static void printTitleLv1(String title) {
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
        // variables
        int nb_blanks = OUTPUT_WIDTH - title.length() - 2;

        // first char
        System.out.print("\n" + FILL_CHAR);
    }
}
