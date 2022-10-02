
package javabeginner;
/**
 * @author Md. Talal Wasim
 */

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        
        points.put("Rafa", 1);
        points.put("Safaa", 2);
        points.put("Kalpo", 3);
        points.put("Nahi", 4);
        points.put("Abdullah", 5);
        points.put("Taimur", 6);
        
        System.out.println(points);
        //System.out.println("remove()"+point.remove("Nahi",180));
        //System.out.println(point);
        System.out.println("Taimur's  :"+points.get("Taimur"));
        System.out.println("Nahi is :"+points.get("Nahi"));
        System.out.println("Kalpo is :"+points.get("Kalpo"));
        System.out.println("Abdullah is :"+points.get("Abdullah"));
        System.out.println("Rafa is :"+points.get("Rafa"));
        System.out.println("Safaa spelling wrong so, Key => is :"+points.get("Safa"));
        System.out.println("Safaa is :"+points.get("Safaa"));
        
        System.out.println(points.remove("Safaa", 2));//return true.
        points.remove("Rafa");//we can remove element with only key value also.
       // point.remove(5);//try to delete with value, but won't delete
        System.out.println(points);
        
        
    }
}
