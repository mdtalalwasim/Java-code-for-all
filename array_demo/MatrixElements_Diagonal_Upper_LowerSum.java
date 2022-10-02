
package array_demo;

import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class MatrixElements_Diagonal_Upper_LowerSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [][] A = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;
        
        //getting input for matrix
        System.out.println("Entere elements in matrix");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] =",row,col);
                A[row][col] = input.nextInt();
                        
            }
            System.out.println();
        }
        
        //
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if (row<col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                if (row>col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal Elements :"+sumOfDiagonalElements);
        System.out.println("Sum of Upper Elements :"+sumOfUpperElements);
        System.out.println("Sum of Lower Elements :"+sumOfLowerElements);
        
        
        
    }
}
