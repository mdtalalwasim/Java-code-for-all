
package javabeginner;

import java.util.Scanner;

public class PalindromeNumberCheck {
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
        
        //System.out.println("Reverse Number is: "+sum);
        
        if (sum == num) { //after reversing a number, is match with inputed num?
            System.out.println("Palindrom Number");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
