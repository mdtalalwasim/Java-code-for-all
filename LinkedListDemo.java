
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */


import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //LinkedList<String> l = new LinkedList<String>();
        LinkedList   colors = new LinkedList();
        
         colors.add("RED");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        System.out.println("LinkedList is : "+colors);
        colors.remove("Yellow");
        //System.out.println(colors);
        System.out.println("After using remove :"+colors);
        System.out.println("contains() return only true/false :"+colors.contains("RED"));
        System.out.println("Get Index of :"+colors.get(1)); //green
        System.out.println("size() "+colors.size());
        //System.out.println(colors.clear());
        colors.clear();
        System.out.println("After clear() the List : "+colors);
        
    }
}
