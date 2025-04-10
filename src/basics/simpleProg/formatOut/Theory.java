package basics.simpleProg.formatOut;

// https://hyperskill.org/learn/step/7046

import formatting.PrintTitle;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Formatted Output - Theory");
        Scanner scanner = new Scanner(System.in);


        PrintTitle.printTitleLv2("printf() introduction");
        System.out.printf("\tMy name is %s.\n\tI was born in %d.", "Paul", 1977);

        PrintTitle.printTitleLv2("Different use cases");
        System.out.println("Integer:");
        System.out.printf("Current year is %d.\n", Year.now().getValue());
        Calendar calendar = Calendar.getInstance();
        System.out.printf("Current day/month/year = %d/%d/%d.",
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.YEAR));

        System.out.println("\n\nFloating-point value");
        System.out.printf("Human Body temperature (Celcius) = %f\n", 37.5f);
        System.out.printf("Human Body temperature (Celcius) = %.1f\n", 37.5f);

        System.out.println("\n\nChars and Strings");
        System.out.printf("Symbol = %c ; Compound = %s", 'N', "Nitrogen");

        PrintTitle.printTitleLv2("String.format() method");
        String template = "Your name is %s. How are you doing?";
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        String filledTemplate = String.format(template, userName);
        System.out.println(filledTemplate);
        String template2 = "You were born in %d. You are %d years old.\n";
        System.out.println("Please enter your birth year:");
        int birthYear = scanner.nextInt();
        System.out.println(template2.formatted(birthYear, Year.now().getValue() - birthYear));

        String template3 = "Your name is %n%s:%nIt is beautiful.\n";
        System.out.println(String.format(template3, userName));

        scanner.close();
        PrintTitle.printTitleLv1("End of Theory");
    }
}
