package lab;
import java.util.*;

class Game {
    public String name;
    private int diceTotal = 0;
    Random random = new Random();

    public Game(String name){
        this.name = name;
    }

    public void moveDice(){
        int randomMove = random.nextInt(6) + 1; // 1 to 6
        System.out.println(name + " rolls: " + randomMove);
        this.diceTotal += randomMove;
    }

    public int getDiceScore(){
        return this.diceTotal;
    }

    
    public boolean win(){
        if(this.diceTotal >= 100)
            return true;
        return false;
    }
}

public class L8Q5 {
    public static void main(String[] args) {
        Game p1 = new Game("JACK");
        Game p2 = new Game("JILL");

        while(true){
            // Player 1 move
            p1.moveDice();
            System.out.println(p1.getDiceScore() + " points total");
            if(p1.win()){
                System.out.println(p1.name + " wins!");
                break;
            }

            // Player 2 move
            p2.moveDice();
            System.out.println(p2.getDiceScore() + " points total");
            if(p2.win()){
                System.out.println(p2.name + " wins!");
                break;
            }
        }
    }
}
