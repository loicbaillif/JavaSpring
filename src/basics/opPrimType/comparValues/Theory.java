package basics.opPrimType.comparValues;

// https://hyperskill.org/learn/step/3512

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Comparing values. Relational operators - Theory");

        PrintTitle.printTitleLv2("List of relational operators");
        System.out.println("\t== (equal to)");
        System.out.println("\t!= (not equal to)");
        System.out.println("\t> (greater than)");
        System.out.println("\t>= (greater than or equal to)");
        System.out.println("\t< (less than)");
        System.out.println("\t<= (less than or equal to)");

        PrintTitle.printTitleLv2("Comparing integer numbers");
        System.out.println("\t1 == 1 ==> " + (1 == 1));
        System.out.println("\t1 != 1 ==> " + (1 != 1));
        System.out.println("\t1 > 1 ==> " + (1 > 1));
        System.out.println("\t1 >= 1 ==> " + (1 >= 1));
        System.out.println("\t1 < 1 ==> " + (1 < 1));
        System.out.println("\t1 <= 1 ==> " + (1 <= 1));

        PrintTitle.printTitleLv2("Joining relational operations using logical operators");
        int user_age = 22;
        System.out.println("user_age > 18 && user_age < 24 ==> " + (user_age > 18 && user_age < 24));
        int low = 100, high = 200;
        boolean inRange = user_age > low && user_age < high;
        System.out.println("inRange == " + inRange);

        PrintTitle.printTitleLv1("End of Theory");
    }
}
