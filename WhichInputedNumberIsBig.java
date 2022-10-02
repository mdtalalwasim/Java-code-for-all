package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class WhichInputedNumberIsBig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2=  input.nextInt();
        int n3 = input.nextInt();
        
        //System.out.println("Number 1: "+n1 + " Number 2: "+n2 + " Number 3: "+n3);
        
        if (n1 > n2 && n1>n3) {
            
            System.out.println(n1 + " is bigger than "+ n2 + " and "+n3);
        }
        if (n2 > n1 && n2>n3) {
            
            System.out.println(n2 + " is bigger than "+ n1 + " and "+n3);
        }
        if (n3 > n1 && n3>n2) {
            
            System.out.println(n3 + " is bigger than "+ n1 + " and "+n2);
        }
        else{
            System.out.println("check your inputed number!");
        }
    }
}
