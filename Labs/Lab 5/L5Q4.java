package lab;
import java.util.Scanner;

public class L5Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matrix = new int [3][3];

        //Input
        System.out.println("Enter a 3 x 3 matrix: ");
        for(int i = 0 ; i<3 ; i++){
            for (int j = 0; j<3 ; j++){
                matrix[i][j] = s.nextInt();
            }
        }

        //output
        System.out.println("The matrix is : ");
        for(int i = 0 ; i<3 ; i++){
            for (int j = 0; j<3 ; j++){
                System.out.print(matrix[i][j] + " ");   
            }
            System.out.println();
        }
        

        //transpose
        for(int i=0; i<3 ; i++){
            for(int j = i; j<3 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse each row
        
        for(int i = 0; i<3 ; i++){
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][2];
            matrix[i][2] = temp;
            }
        
        //Rotated output
        System.out.println("The rotated matrix is : ");
        for(int i = 0 ; i<3 ; i++){
            for (int j = 0; j<3 ; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }







    }
}
