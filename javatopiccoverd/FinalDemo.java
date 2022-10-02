
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */


class Bike{  
  final void run(){System.out.println("running...");} //final method 
}  

public class FinalDemo extends Bike {//Honda Class
    public static void main(String[] args) {
        //FinalDemo honda = new FinalDemo();
        //honda.run();
        
        new FinalDemo().run();
    }
}
