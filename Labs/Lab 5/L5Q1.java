package lab;

import java.util.Scanner;
import java.util.Random;
public class L5Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the number of students (N): ");
        int N = s.nextInt();

        int [] scores = new int[N];
        for (int i = 0 ; i<N ; i++){
            scores[i] = r.nextInt(101);
        }

        // Print scores
        System.out.println("Scores of the students:");
        for(int i =0 ; i<N ; i++){
            System.out.println("Student " + (i+1) + ": " + scores[i]);
        }
        // Calculate minimum and maximum score

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i <scores.length ; i++){
            if (scores[i] < min){
                min = scores[i];
            }
            if(scores[i] > max){
                max = scores[i];
            }
        }

        // Calculate average score
        double avg;
        int sum;

        sum = 0;
        for(int i = 0; i<scores.length ; i++){
            sum = sum + scores[i];
        }
        avg = (double) sum / N;
        System.out.println();
        System.out.println("Average score: " + avg);
        System.out.println("Lowest score: " + min);
        System.out.println("Highest score: " + max);
    }
}
