package lab;
import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        System.out.println("Factors of " + n + "are :");
        int i = 1;
        while(i<=n){
            if(n%i == 0){
                System.out.print(i + " ");}
                i++;
            }
            s.close();
        }
    }

