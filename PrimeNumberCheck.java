
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        
        if(count == 0){
                System.out.println("Prime");
            }
        else{
                System.out.println("Not Prime");
            }
    }
}
