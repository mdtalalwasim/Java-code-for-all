
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Numbers!");
        int num1, num2, large;
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1>num2)? num1:num2;
        System.out.println("Large is:"+ large);
        
        

    }
    
}
