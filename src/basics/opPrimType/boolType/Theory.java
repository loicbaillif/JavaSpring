package basics.opPrimType.boolType;

// https://hyperskill.org/learn/step/3516

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Boolean type and operations - Theory");

        PrintTitle.printTitleLv2("Boolean Types");
        boolean open = true;
        boolean close = false;
        System.out.println("open: " + open);
        System.out.println("close: " + close);

        PrintTitle.printTitleLv1("Logical operators");
        System.out.println("- NOT");
        boolean f = false;
        boolean t = !f;
        System.out.println("t = !false ==> t = " + t);

        System.out.println("\n- AND");
        System.out.println("false && false = " + (false && false));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("true && true = " + (true && true));

        System.out.println("\n- OR");
        System.out.println("false || false = " + (false || false));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("true || true = " + (true || true));

        System.out.println("\n- XOR");
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("true ^ true = " + (true ^ true));

        PrintTitle.printTitleLv2("The precedence of logical operators");
        System.out.println("Decreasing priority: \n\t!\n\t^\n\t&&\n\t||");

        PrintTitle.printTitleLv1("End of Theory");
    }
}
