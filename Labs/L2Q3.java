package lab;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
          Random ran = new Random();
          
        double one = 10 + ran.nextInt(40);
        double two = 10 + ran.nextInt(40);
        double three = 10 + ran.nextInt(40);
        
        System.out.println("the three numbers are :");
        System.out.printf("%.2f%n",one);
        System.out.printf("%.2f%n",two);
        System.out.printf("%.2f%n",three);
        
        double sum = one+two+three;
        
        System.out.printf("sum of the three numberss is %.2f%n",sum);
        
        double average = sum/3;
        System.out.printf("the average of the three numbers is %.2f%n", average);
            
        }
}
