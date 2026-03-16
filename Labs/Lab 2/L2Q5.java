package lab;

import java.util.Random;


public class L2Q5 {
     public static void main(String[] args) {
        Random r = new Random();
        
        int num = r.nextInt(10001);
        System.out.println("The number is " + num);

        int total = 0; 
        
        do{
            total += num%10;
            num /= 10;
        }while ( num > 0);
        
        System.out.println("The sum of all the digits in the number is " + total);
        // TODO code application logic here
    
   
    
    }
    
}

