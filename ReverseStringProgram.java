import java.util.*;
 
public class ReverseStringProgram
{
   public static void main(String args[])
   {
      String originalString, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string for Reverse");
      originalString = in.nextLine();
 
      int length = originalString.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + originalString.charAt(i);
 
      System.out.println("Reverse String is : "+reverse);
   }
}