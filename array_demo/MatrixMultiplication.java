
package array_demo;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        System.out.println("Please Enter ROW number of a Matrix: ");
        Scanner input = new Scanner(System.in);
        int m,n,m1,n1;
        
        m = input.nextInt();
        
        System.out.println("Please Enter COLUMN number of a Matrix: ");
        n = input.nextInt();
        
        int[][] matrixA = new int[m][n];//m=row, n=col
        //int[][] matrixC = new int[][];
        
        //getting input for Matrix A:
        System.out.println("Enter Elements for Matrix A:");
        for (int row = 0; row < m; row++) {// m = user inputed row num, n=col number by user.
            for (int col = 0; col < n; col++) { //
                System.out.printf("A[%d][%d]= ",row,col);
                matrixA[row][col] = input.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Please Enter ROW number of a Matrix B: ");
        m1 = input.nextInt();
        System.out.println("Please Enter COLUMN number of a Matrix B: ");
        n1 = input.nextInt();
        int[][] matrixB = new int[m1][n1];//m=row, n=col
        
        //getting input for Matrix B:
        System.out.println("Enter Elements for Matrix B:");
        for (int row = 0; row < m1; row++) {// m = user inputed row num, n=col number by user.
            for (int col = 0; col < n1; col++) { //
                System.out.printf("B[%d][%d]= ",row,col);
                matrixB[row][col] = input.nextInt();
            }
            System.out.println();
        }
        //Print elements for Matrix A:
        System.out.println("Matrix A= ");
        for (int row = 0; row < m; row++) {// m = user inputed row num, n=col number by user.
            for (int col = 0; col < n; col++) { //
                
                System.out.print("\t"+matrixA[row][col]);
                
            }
            System.out.println();
        }
        //Print elements for Matrix B:
        System.out.println("Matrix B= ");
        for (int row = 0; row < m1; row++) {// m = user inputed row num, n=col number by user.
            for (int col = 0; col < n1; col++) { //
                
                System.out.print("\t"+matrixB[row][col]);
                
            }
            System.out.println();
        }
        
        //A x B:
        int matrixC[][] = new int[m][n];
        System.out.println("A x B = ");
        
        
        for (int row = 0; row < m; row++) {// m = user inputed row num, n=col number by user.
            for (int col = 0; col < n; col++) { //
                matrixC[row][col] = 0;
                //System.out.print("\t"+(matrixA[row][col] * matrixB[row][col]));
               matrixC[row][col]  = matrixC[row][col] + (matrixA[row][col] * matrixB[row][col]);
               System.out.print("\t"+matrixC[row][col]);
            }
            System.out.println();
        }
        
        
    }
}
