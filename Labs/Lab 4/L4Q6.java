package lab;
import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("Random number: " + num);

        int count = 0;
        int a = num;

        if (num==0) {
            count = 1;
        } else {
            while (a > 0) {
                a  = a/10;
                count++;
            }
        }  
        System.out.println("Number of digits: " + count); 
    }
}
