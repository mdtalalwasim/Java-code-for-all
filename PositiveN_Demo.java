
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;


public class PositiveN_Demo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num >0) {
            System.out.println("Positive");
        }
        else if (num < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero!");
        }
    }
}
