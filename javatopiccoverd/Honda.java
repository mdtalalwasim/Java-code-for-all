
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim 
 */
abstract class Bike{  
  abstract void run();  
}  
class Honda extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 //Bike obj = new Honda(); 
Honda obj = new Honda();
Bike obj2 = new Honda();
 obj.run(); 
 obj2.run();
}  
}  