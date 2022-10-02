
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class DefaultConstructorDemo {
    
    //default constructor
    DefaultConstructorDemo(){
        System.out.println("DefaultConstuctor Is Created!");
    }
    
    
    
    public static void main(String[] args) {
        DefaultConstructorDemo obj = new DefaultConstructorDemo();//default constructor call/invoke implictly
    }
}
