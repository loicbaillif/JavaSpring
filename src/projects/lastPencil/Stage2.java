package projects.lastPencil;

// https://hyperskill.org/projects/341/stages/2006/implement

import formatting.PrintTitle;

import java.util.Objects;
import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        PrintTitle pt = new PrintTitle();
        pt.printTitleLv1("Last Pencil - Stage 2/5");

        // Variables
        Scanner sc = new Scanner(System.in);
        int nbPencils;
        String player1 = "Josephine";
        String player2 = "Jane";
        boolean player1Starts;

        System.out.println("How many pencils would you like to use:");
        nbPencils = sc.nextInt();

        System.out.printf("Who will be the first (%s, %s):%n", player1, player2);
        player1Starts = Objects.equals(sc.nextLine(), player1);

        for (int i = 0; i < nbPencils; i++) {
            System.out.print("|");
        }
        System.out.println();

        sc.close();

        pt.printTitleLv1("End of stage 2");
    }
}
