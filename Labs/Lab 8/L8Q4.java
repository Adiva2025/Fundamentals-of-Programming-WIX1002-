package lab;
import java.util.*;
class Fraction{
    private int numerator;
    private int denominator;

   public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    private int findGCD(int a, int b) {
    while(b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
    public void simplify(){
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        System.out.println("Fraction after simplification: " + numerator + "/" + denominator);
    }
    
} 
public class L8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denom = scanner.nextInt();

        Fraction f1 = new Fraction();
        f1.setNumerator(num);
        f1.setDenominator(denom);

        f1.simplify();
        
    }
    
}
