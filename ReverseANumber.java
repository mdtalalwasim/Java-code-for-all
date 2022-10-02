
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        int num, sum = 0, temp, remainder;
        
        System.out.print("Please Enter a number :");
        
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        
        temp = num;
        
        while (temp!=0) {            
            remainder = temp%10;
            sum = sum *10 + remainder; //only this line is change compare to Sum of Digits Program
            temp = temp/10;
        }
        System.out.println("Reverse Number is: "+sum);
        
    }
}
