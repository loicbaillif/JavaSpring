package basics.controlFlow.breakCont;

// https://hyperskill.org/learn/step/3507

import formatting.PrintTitle;

public class Theory {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("break & continue: branching - Theory");

        PrintTitle.printTitleLv2("The break statement");
        int i = -5;
        while (true) {
            if (i == 3) {
                break;
            }
            System.out.printf("%d\n", i);
            i++;
        }

        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d%d ", i, j);
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }

        PrintTitle.printTitleLv1("End of Theory");
    }
}
