
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        
        set.add("Rafa");
        set.add("Safaa");
        set.add("Kalpo");
        set.add("Abdullah");
        System.out.println("Output is :"+set);
        System.out.println("Size of HashSet is :"+set.size());
       
    }
}
