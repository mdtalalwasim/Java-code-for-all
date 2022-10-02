
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class SumOfDigitsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = input.nextInt();
        int temp, remainder, sum = 0;
        
        temp = number;
        
        while(temp!=0){
            remainder = temp%10;
            sum = sum + remainder;
            temp = temp /10;
        }
        System.out.println("Sum of Inputed Digits :"+sum);
       
    }
}
