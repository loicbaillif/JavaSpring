package projects.lastPencil;

// https://hyperskill.org/projects/341/stages/2006/implement

import formatting.PrintTitle;

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        PrintTitle pt = new PrintTitle();
        pt.printTitleLv1("Last Pencil - Stage 2/5");

        // Variables
        Scanner sc = new Scanner(System.in);
        int nbPencils = sc.nextInt();
        String player1 = "Josephine";
        String player2 = "Jane";


        sc.close();

        pt.printTitleLv1("End of stage 2");
    }
}
