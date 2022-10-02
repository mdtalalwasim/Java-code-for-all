
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a numbers for fibonacci :");
        int n = input.nextInt();
        
        int firstNumber = 0;
        int secondNumber = 1;
        int fibo;
        System.out.print("Fibonacci Series is :"+ firstNumber+" "+secondNumber);
        for (int i = 3; i <=n; i++) {
            fibo = firstNumber + secondNumber;
            System.out.print(" "+fibo);
            //System.out.println(" ");
            firstNumber = secondNumber;
            secondNumber = fibo;
        }
    }
}
