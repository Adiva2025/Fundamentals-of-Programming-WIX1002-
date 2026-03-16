package lab;

import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int MAX = 6;

        int  player1Roll ,player2Roll, player1Total = 0,player2Total = 0 ;
       

        System.out.println("Welcome to the Dice Game!");
        System.out.println("First player to get more than 100 points wins.\n");

        do {
            // Player 1 turn
            do {
                player1Roll = r.nextInt(MAX) + 1; 
                player1Total = player1Total + player1Roll;
                System.out.println("Player 1 rolls: " + player1Roll);
                System.out.println("Player 1 total: " + player1Total);

                if (player1Roll == 6) {
                    System.out.println("Roll again.\n");
                }
            } while (player1Roll == 6 && player1Total <= 100); // roll again if 6

            // Player 2 turn (only if Player 1 hasn't won)
            if (player1Total <= 100) {
                do {
                    player2Roll = r.nextInt(MAX) + 1; // roll 1-6
                    player2Total += player2Roll;
                    System.out.println("Player 2 rolls: " + player2Roll);
                    System.out.println("Player 2 total: " + player2Total);

                    if (player2Roll == 6) {
                        System.out.println("Roll again.\n");
                    }
                } while (player2Roll == 6 && player2Total <= 100);
            }

           

        } while (player1Total <= 100 && player2Total <= 100);
        System.out.println();
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1Total);
        System.out.println("Player 2: " + player2Total);
        System.out.println();

        if (player1Total > 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
 


