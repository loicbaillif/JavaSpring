package formatting;

public class PrintTitle {
    public static void printTitleLv1(String title) {
        // variables
        int outputWidth = 80;
        char fillChar = '*';

        // Print
        for (int i = 0; i < outputWidth; i++) {
            System.out.print(fillChar);
        }
        System.out.println();

        for (int i = 0; i < outputWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
