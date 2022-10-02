
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class PrimeNumberMtoNDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial Number :");
        int m = input.nextInt();
        System.out.print("Enter Final Number :");
        int n = input.nextInt();
        int count=0, totalPrime=0;
        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i-1; j++) {
                if (i%j == 0) {
                    count++;
                    break;
                }
                
            }
            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total Prime number is :"+totalPrime);
    }
}
