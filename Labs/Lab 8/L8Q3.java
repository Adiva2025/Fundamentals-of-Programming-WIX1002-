package lab;
import java.util.*;

class WeightCalculator{
    private int age;
    private double cm;

    public WeightCalculator(int age, double cm) {
        this.age = age;
        this.cm = cm;
    }
    public double recommendWeight() {
        double recommendedWeight;
        recommendedWeight = (cm - 100 + age / 10) * 0.9;
        return recommendedWeight;
    }
    public void displayInfo() {
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + cm + " cm");
        System.out.println("Recommended Weight: " + recommendWeight() + " kg");
    }
}
public class L8Q3 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.print("Enter your age: ");
       int age = s.nextInt();
       System.out.print("Enter your height(in cm): ");
       double cm = s.nextDouble();

        WeightCalculator wc = new WeightCalculator(age, cm);
        wc.displayInfo();
    }
}