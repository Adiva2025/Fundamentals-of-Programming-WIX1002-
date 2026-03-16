package lab;
import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of row of Pascal Triangle to generate: ");
        int n = s .nextInt();

        int [][] matrix = new int [n][n];

        //Initialize the matrix with 0 for the cells which will not have value in future
        for(int i = 0; i< n; i++){
            for( int j = 0 ; j<n ; j++){
                matrix[i][j] = 0;
            }
        }
        //Filling the first column with 1 wrt row number
        for (int i = 0; i <n; i++){
            matrix[i][0] =1;
            
            //Formula to generate Pascal Triangle
            for( int j = 1; j<= i; j++){
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        //Output
        System.out.print("The Pascal Triangle with " + n + " rows is: ");
        for( int i = 0 ; i<n; i++){
            for( int j = 0; j<n; j++){
                System.out.printf("%-4d", matrix[i][j] );
            }
            System.out.println();
        }
    }
}
