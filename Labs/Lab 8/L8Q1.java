package lab;
import java.util.Random;

class Number{
    Random r = new Random();
    private int[] randomInteger;

    public Number(){
        this.randomInteger = new int[10];
        for(int i=0; i<10; i++){
            this.randomInteger[i] = r.nextInt(100);
        }
    }
     public Number(int num){
        this.randomInteger = new int[num];
        for(int i=0; i<num; i++){
            this.randomInteger[i] = r.nextInt(100);
        }
    }
    public Number(int num, int range){
        this.randomInteger = new int[num];
        for(int i = 0; i < num; i++){
            this.randomInteger[i] = r.nextInt(range + 1);
        }
    }
    public void display(){
        System.out.println("Random Integer List: ");
        for(int i=0; i<this.randomInteger.length; i++){
            System.out.print(randomInteger[i] + " ");
        }
        System.out.println();
    }
    public void even(){
        System.out.println("Even Numbers: ");
        for(int i=0; i<this.randomInteger.length; i++){
            if(this.randomInteger[i] % 2 == 0){
                System.out.print(randomInteger[i] + " ");
            }
        }
        System.out.println();
    }
    public boolean primeDetector(int number){
        if(number == 1) return false;
        for(int i  = 2; i*i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public void prime(){
        System.out.println("Prime Numbers: ");
        for(int i=0; i<this.randomInteger.length; i++){
            if(primeDetector(this.randomInteger[i])){
                System.out.print(randomInteger[i] + " ");
            }
        }
        System.out.println();
    }
    public void getMax(){
        int max = this.randomInteger[0];
        for(int i=1; i<this.randomInteger.length; i++){
            if(this.randomInteger[i] > max){
                max = this.randomInteger[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
    public void getMin(){
        int min = this.randomInteger[0];
        for(int i=1; i<this.randomInteger.length; i++){
            if(this.randomInteger[i] <min){
                min = this.randomInteger[i];
            }
        }
        System.out.println("Minimum value: " + min);
    }
    public void getAvg(){
        int sum = 0;
        for(int i=0; i<this.randomInteger.length; i++){
            sum += this.randomInteger[i];
        }
        double avg = (double)sum / this.randomInteger.length;
        System.out.printf("Average value: %.2f\n", avg);
    }
    public void getSq(){
        System.out.println("Square of the Numbers: ");
        for(int i=0; i<this.randomInteger.length; i++){
            System.out.print((this.randomInteger[i] * this.randomInteger[i]) + " ");
        }
        System.out.println();
    }
}

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        a.display();
        a.even();
        a.prime();
        a.getMax();
        a.getMin();
        a.getAvg();
        a.getSq();

        System.out.println();

        Number b = new Number(5);
        b.display();
        b.even();
        b.prime();
        b.getMax();
        b.getMin();         
        b.getAvg();
        b.getSq();
        System.out.println();

        Number c = new Number(4, 50);
        c.display();
        c.even();       
        c.prime();
        c.getMax();
        c.getMin();
        c.getAvg();
        c.getSq();

    }
}
