package lab;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
      
        // List creation
        int [] list = new int [20];
        for( int i = 0; i < 20 ; i++){
            list[i] = r.nextInt(101);
        }
       
        //Output
        System.out.println("A list of random integer within 0 to 100");
        for(int i = 0; i < list.length ; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();

        // Sort in descending order
        for( int i = 0; i < list.length - 1 ; i++){
            for( int j = 0; j< list.length -1 - i ; j++){
                if( list[j] < list[j+1]){
                int temp = list[j];
                list[j] = list[j+1];
                list [j+1] = temp;
                }
            } 
        }
    
         // Output sorted list
         System.out.println("Array in descending order: ");
         for(int i = 0; i < list.length ; i++){
            System.out.print(list[i] + " ");
         }
         System.out.println();

         // Search for a number
         System.out.print("Enter a number to search: ");
         int x = s.nextInt();
    
         // Linear search
         for( int i = 0; i< list.length ; i++){
            if(list[i] == x){
                System.out.println(x + " found");
                System.out.println("Linear Search: " + (i+1) + " loop(s)");
                break;
            }
         }

         //Binary Search
         int start = 0;
         int end = list.length -1;
         int mid;
         int count = 0;

         while(start<=end){
            mid = (start + end)/2;

            if(list[mid] == x){
                count++;
                break;
            }
            else if( list[mid] < x){
                end = mid - 1;
                count++;
            }
            else{
                start = mid + 1;
                count++;
            }
        }
        System.out.println(x + " found");
        System.out.println("Binary search : " + count + " loop(s)");
         
    }
}
