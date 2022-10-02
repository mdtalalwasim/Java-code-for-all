
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class SeriesProblem_3 {
     public static void main(String[] args) {
        //2. 2 + 4 + 6 + .... +n;
        /*Scanner input = new Scanner(System.in);
        int sum=0;
        int n;
        System.out.print("Enter last number = ");
        n = input.nextInt();
        for (int i = 2; i <=n; i= i+2) {
            System.out.print(i+" ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);
        */
        
        //4. 1 x 2 x 3 x .... xn;
        Scanner input = new Scanner(System.in);
        int sum=1;
        int n;
        System.out.print("Enter last number = ");
        n = input.nextInt();
        for (int i = 1; i <=n; i= i+2) {
            System.out.print(i+" ");
            sum = sum * i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
