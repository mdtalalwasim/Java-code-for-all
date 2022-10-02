
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.LinkedList;

public class LinkedListEnhancedForLoop {
    public static void main(String[] args) {
         LinkedList<String> list = new LinkedList<String>(); 
         list.add("Red");
         list.add("Green");
         list.add("Blue");
         list.add("Aqua");
         list.add("White");
         list.add("Black");
         list.add("Violate");
         list.add("Yellow");
         
         System.out.println("Elemnts are :"+list);
         
         for (String s : list) {
             System.out.println(s);
        }
    }
}
