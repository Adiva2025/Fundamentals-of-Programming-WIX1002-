package lab;
import java.util.Random;
import java.util.Scanner;
public class L5Q3 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Random r = new Random();
       System.out.print("Enter the number of employees: ");
       int N = s.nextInt();

       for( int emp = 0; emp <= N ; emp++){
        int [] workhours = new int [7];
        int totalhours = 0;

        System.out.println("Employee " + (emp + 1) + " work hours :");

        for( int day = 0; day < 7 ; day++){
            workhours[day] = r.nextInt(8) + 1; // generates random hours between 0-8
            totalhours = totalhours + workhours[day];
            System.out.println("Day " + (day + 1) + ": " + workhours[day] + " hours");
        }
        System.out.println("Total hours worked : " + totalhours);
        System.out.println();
       }
       System.out.println();
    }
}
