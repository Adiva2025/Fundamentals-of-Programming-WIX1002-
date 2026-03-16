package lab;
import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] num = new int[10];
        
        for(int i = 0; i<10 ; i++){
            num[i] = r.nextInt(21);
            
            for(int j = 0; j<i ; j++){
                if(num[j] == num[i]){
                    i--;
                    break;
                }
            }
        }
        //Print  
        System.out.println("The random numbers are: ");
        for(int i = 0; i<10 ; i++){
            System.out.print(num[i] + " ");
        }
    }
}