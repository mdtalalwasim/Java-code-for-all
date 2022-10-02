
package array_demo;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class MatrixUserDefineDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row number for Matrix: ");
        //int[][] A = {{},{},{},{}};
        
        int m,n;
        m = input.nextInt();
        System.out.println("Enter Column number for Matrix: ");
        n = input.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        
        //getting the input for Matrix A:
        System.out.println("Please Enter elements for Matrix A:");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col] = input.nextInt();
                
            }
            System.out.println();
        }
        
        //getting the input for Matrix B:
        System.out.println("Please Enter elements for Matrix B:");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("B[%d][%d]=",row,col);
                B[row][col] = input.nextInt();
                
            }
            System.out.println();
        }
        
        //printing Matrix A elements:
        System.out.println("Matrix A: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        //printing Matrix A elements:
        System.out.println("Matrix B: ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
        
        //Matrix A + Matrix B (A + B)is :
        
        System.out.println("A + B : ");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("\t"+(A[row][col]+B[row][col]) );
            }
            System.out.println();
        }
        
        
    }
}
