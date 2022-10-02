
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;


public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int num, sum = 0, temp, remainder;
        
        System.out.print("Please Enter a number :");
        
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        
        temp = num;
        
        while (temp!=0) {            
            remainder = temp%10;
            sum = sum + remainder*remainder*remainder; // multiply remainder 3times, because we need the cube value of remainder.
            temp = temp/10;
        }
        
        
        
        if (sum == num) { //after reversing a number, is match with inputed num?
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
