
package javabeginner;
/**
 * 
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

public class BitwiseOperator {
    
    public static void main(String[] args) {
        int a = 32, b = 12, c;
        c = a & b;
        System.out.println("a & b = "+c);
        c = a | b;
        System.out.println("a | b = "+c);
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
    }
}
