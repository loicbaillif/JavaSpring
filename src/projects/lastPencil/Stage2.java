package projects.lastPencil;

// https://hyperskill.org/projects/341/stages/2006/implement

import formatting.PrintTitle;

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        PrintTitle.printTitleLv1("Last Pencil - Stage 2/5");

        // Variables
        Scanner sc = new Scanner(System.in);
        int nbPencils;
        String player1 = "Josephine";
        String player2 = "Jane";
        boolean player1Starts;

        System.out.println("How many pencils would you like to use:");
        nbPencils = Integer.parseInt(sc.nextLine());

        System.out.printf("Who will be the first (%s, %s):%n", player1, player2);
        player1Starts = sc.nextLine().equals(player1);

        // Print pencils
        for (int i = 0; i < nbPencils; i++) {
            System.out.print("|");
        }
        System.out.println();

        // Print first prompt
        System.out.printf("%s is going first!%n", (player1Starts ? player1 : player2));

        sc.close();

        PrintTitle.printTitleLv1("End of stage 2");
    }
}
