package lab;
import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101); 
        System.out.println("Random number n = " + n);

        int count = 0; 
        int num = 2;  //kyunki 2 is the pehle prime number

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            boolean Prime = true;

            
            for (int i = 2; i < num; i++) { // hum saare numbers check karenge lekin 2 se kyunki humne value pehle hi 2 set ki hai
                if (num % i == 0) {
                    Prime = false; // num is not prime
                    break;
                }
            }

            if (Prime) {
                System.out.print(num + " ,");
                count++;
            }

            num++;
        }
    }
}
    
