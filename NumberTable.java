
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        //number table program
        Scanner input = new Scanner(System.in);
        int result;
        int n;
        System.out.print("Enter the desire number for Number Table = ");
        n = input.nextInt();
        for (int i = 1; i <=10; i= i+1) {
            
            result = n * i;
            System.out.println(n+" x "+i+ " = "+result);
        }
        //System.out.println();
        //System.out.println(sum);
    }
}
