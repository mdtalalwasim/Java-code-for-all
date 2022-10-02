
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Letter for Vowel/Consonant!");
        char ch = input.next().charAt(0);
        
        
        if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U') ) {
            
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
        /*if (ch == 'a' || ch == 'A') {
            
            System.out.println("Vowel");
        }
        else if (ch == 'e' || ch == 'E') {
            
            System.out.println("Vowel");
        }
        else if (ch == 'i' || ch == 'I') {
            
            System.out.println("Vowel");
        }
        else if (ch == 'o' || ch == 'O') {
            
            System.out.println("Vowel");
        }
        else if (ch == 'u' || ch == 'U') {
            
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }*/
        
    }
}
