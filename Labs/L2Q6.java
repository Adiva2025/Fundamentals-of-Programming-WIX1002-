package lab;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Q, tempI, tempF, M;
        
    
        
        System.out.print("Weight of water in g:");
        M = s.nextDouble();
        M = M/1000;
        
        System.out.print("Initial temperature in Fahrenheit: ");
        tempI = s.nextDouble();
        tempI = (tempI - 32)/1.8;
        
        System.out.print("Final temperature in Fahrenheit:");
        tempF = s.nextDouble();
        tempF = (tempF - 32)/1.8;
        
        Q = M * (tempF - tempI) * 4184 ;
        System.out.printf("The energy needed to heat water is %e joules\n", Q);
        // TODO code application logic here
    
        s.close();
    
    }//
   
}
