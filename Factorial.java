
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);
        int fact=1;
        int n;
        System.out.print("Enter a number to findout its factorial = ");
        n = input.nextInt();
        for (int i = n; i >=1; i= i-1) {
            //System.out.print(i+" ");
            fact = fact * i;
        }
        //System.out.println();
        System.out.println("Factorial of "+n+" is :" +fact);
    }
}
