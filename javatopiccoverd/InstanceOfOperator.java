
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class InstanceOfOperator {
    public static void main(String[] args) {
        
        String name ="Wasim";
        InstanceOfOperator instanceObject = new InstanceOfOperator();
        InstanceOfOperator instanceObject2 = null;
        
        System.out.println(instanceObject instanceof InstanceOfOperator);
        System.out.println(instanceObject2 instanceof InstanceOfOperator);
    }
}
