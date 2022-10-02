
package array_demo;

import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim 
 * https://github.com/mdtalalwasim
 * 
 * OUTPUT Will Be Like This:
 *    0  1  2  3  4
 *    5  6  7  8  9
 *    10 11 12 13 14
 *    15 16 17 18 19
 * 
 * 
 */
public class ArrayExample2DArrayInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number2DArray[][] = new int[4][5];
        int element=0;
        
        //value assign in the array row=i, col =j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                number2DArray[i][j] = element;
                element++;
                
            }
        }
        
        //printing the array , row = i, col =j
        System.out.println("Output is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+number2DArray[i][j]);
            }
            System.out.println("");
        }
        

    }
}
