
package array_demo;

import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim
 * Email: md.talalwasim@gmail.com
 * https://github.com/mdtalalwasim
 * 
 */ 
public class MultidimensionalArrayMatrixDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("Please Enter a value for 2x3 Matrix A : ");
        
        //the below loop for taking input into A
        for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 System.out.printf("A[%d][%d]=",row,col);
                A[row][col] = input.nextInt();
            }
        }
        
        System.out.println("Please Enter 2x3 value for Matrix B:");
        //the below loop for taking input into B
        for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 System.out.printf("B[%d][%d]=",row,col);
                B[row][col] = input.nextInt();
            }
        }
        
        //below loop for printing A:
        System.out.println("\n");
        System.out.println("A is:" );
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        
        
        //below loop for printing B:
        System.out.println("B is:" );
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
        }
        
        //Adding A and B (A+B):
        System.out.println("\n\n");
        System.out.println("A+B is:" );
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+(A[row][col] + B[row][col]));
            }
            System.out.println();
        }
        
        
        
    }
}
