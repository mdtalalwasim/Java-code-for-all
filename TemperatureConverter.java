
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;



public class TemperatureConverter {
    
    public static void main(String[] args) {
        
      double centi, faren;
        System.out.println("Enter Temperature in Farenheit for convert it in Celcius:");
        Scanner sc = new Scanner(System.in);
        
        
        faren = sc.nextDouble();
        
        centi = ((faren - 32) * 5) / 9 ;
        System.err.println("Temp in Celcius : "+ centi);
        
      
    }
       
}


