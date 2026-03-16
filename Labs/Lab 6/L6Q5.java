package lab;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static boolean multi(int a, int b, int c) {
        return (a * b) == c;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int score = 0;

        while(true) {

        int r1 = r.nextInt(13);
        int r2 = r.nextInt(13);

        
        System.out.println("Enter negative number to quit.");
        System.out.print( r1 + "x" + r2 + " = ");
        int ans = s.nextInt();
        if(ans < 0) {
            System.out.println("Bye!");
            break;
        }
        if(multi(r1, r2, ans)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
            }
        }
        System.out.println("Your score: " + score);
    }
}
