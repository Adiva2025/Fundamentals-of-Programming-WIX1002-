package lab;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        double avg, std;
        int max = 0, min = 0, N = 0, score = 0, sum = 0, sumS = 0, a;
        // N = number of scores entered , sumS = sum of squares of scores

        do{
            System.out.print("Enter a score (negative score to quit): ");
            score = s.nextInt();
            
            if (score >= 0){
                N++;
                
                if (N == 1) // as it is pehla number toh yahi max aur min hai
                {
                    max = score;
                    min = score;
                }
                
                a = score;
                //jab dusra number ayega toh woh upar ki condn skip karke direct yahan ayega compare hone ke liye 
                if (a < min){      
                    min = a;
                }

                else if (a > max) {
                    max = a;
                }
                sum = sum + score;
                sumS = sumS + score*score;
            }
        }
        while(score >= 0);
            
        if (score == -1 && N >= 0){
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            
            avg = sum / N;
            std = Math.sqrt((sumS-((sum*sum)/N))/(N - 1));
            
            System.out.printf("Average Score: %.2f\n", avg);
            System.out.printf("Standard Deviation: %.2f\n", std);
        }
        s.close();
}
    }

