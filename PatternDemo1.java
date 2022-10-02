
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class PatternDemo1 {
    public static void main(String[] args) {
        
        System.out.print("Enter Line numbers :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col); //print col value.
            }
            //Same code for "*" and "#" print
            
            System.out.println(" ");
        }
        
        
    }
}
