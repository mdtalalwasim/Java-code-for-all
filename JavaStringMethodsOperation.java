
package javabeginner;
/**
 * 
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

public class JavaStringMethodsOperation {
    public static void main(String[] args) {
           String firstSubstring = "Hello World".substring(6);
           System.out.println(firstSubstring);
           
           String SecondSubstring = "Rafa Kalpo Safaa Nahi Abdullah Taimur".substring(0, 12);
           System.out.println(SecondSubstring);
           
           char myChar = "Wasim".charAt(0);
           System.out.println(myChar);
          
           boolean isStringisEqualOrNot = "Wasim".equals("WASIM"); //false cause java is case sensitive...
           System.out.println(isStringisEqualOrNot);
           
           String names = "Rafa Kalpo Safaa Nahi Abdullah Taimur";
           String[] splitNames = names.split("-", 5);
           for (int i = 0; i < splitNames.length; i++) {
           
               System.out.print(splitNames[i]);
        }
           
    }
    
}
