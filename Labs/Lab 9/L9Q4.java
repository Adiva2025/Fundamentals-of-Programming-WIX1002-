package lab;


class Dice{
  public int roll(){
    return (int)(Math.random()*6)+1;
  }  
}

class TwoDiceGame{
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    int score = 0;

    public void play(){
        System.out.println("Two Dice game Started");

        while(score<100){
          int dice1 = d1.roll();
          int dice2 = d2.roll();

           int turnScore = dice1 + dice2;
           score += turnScore;

           System.out.println("Rolled: " + dice1 + " and " + dice2);
           System.out.println("Score added: " + turnScore);
           System.out.println("Total score: " + score);

            if (dice1 == dice2) {
                System.out.println("Both dice same! Roll again\n");
            } else {
                System.out.println("Next turn\n");
            }  
        }
        System.out.println("Player wins Two Dice Game!\n");
    }
}
class OneDiceGame{
    Dice d1 = new Dice();
    int score = 0;

    public void play() {
        System.out.println("One Dice Game Started");
        while (score<100) {
            int roll = d1.roll();
            System.out.println("Rolled: " + roll);

            int turnScore = roll;

            if(roll == 6){
                int rollAgain = d1.roll();
                System.out.println("Second roll: " + rollAgain);
            
                if(rollAgain == 6){
                    turnScore = 0;
                    System.out.println("Two sixes! No score this turn");
                }
                else{
                    turnScore = roll + rollAgain;
                }
            }
        
            if (score + turnScore > 100) {
                System.out.println("Score exceeded 100, not counted");
            } else {
                score += turnScore;
                System.out.println("Score added: " + turnScore);
            }

            System.out.println("Total score: " + score + "\n");
        }

        System.out.println("Player wins One Dice Game!");
            
        
    }
}

public class L9Q4 {
    public static void main(String[] args) {
        TwoDiceGame game1 = new TwoDiceGame();
        game1.play();

        OneDiceGame game2 = new OneDiceGame();
        game2.play();
    }
}
