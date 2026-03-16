package lab;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double fah, cel;
    
       System.out.print("Please input the temperature in degree Fahrenheit: ");
       fah = sc.nextDouble();
       cel = (fah - 32) / 1.8;
       
       System.out.printf("The temperature in degree Celsius is %-5.2f", cel);
   
    sc.close();
}

}
