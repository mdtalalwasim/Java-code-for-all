
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
import java.util.Scanner;

public class NumberTable_RangeNumberTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int n;
        
       
        
        
        System.out.println("Please input Initial number for Number Table :");
        m = input.nextInt();
        System.out.println("Please input Final number for Number Table :");
        n = input.nextInt();
        
        for (int i = m; i <=n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);
               
            }
            System.out.println("");
        }
    }
    
}
