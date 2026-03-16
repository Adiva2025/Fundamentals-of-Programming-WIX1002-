package lab;

import java.util.Scanner;

public class L6Q3 {
     public static void reverse(int[]array){
        for (int i = 0; i< array.length ; i++){
            int num = array[i];
            int reversed = 0;

            while(num>0){
                int digit = num%10;
                reversed = reversed * 10 + digit;
                num = num /10;
            }
            array[i] = reversed;
        }
     }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter 10 integers: ");
        for(int i = 0; i < 10; i++){
            list[i] = s.nextInt();
        }
        reverse(list);

        System.out.println("After reversing: ");
        for (int i =0 ; i< list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
