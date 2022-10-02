
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

/*
The other way of creating Threads is implementing the Runnable interface.
Implement the run() method. Then, create a new Thread object, 
pass the Runnable class to its constructor, and start the Thread 
by calling the start() method.
Example:
*/

class MyClass implements Runnable{
    public void run(){
        System.out.println("Hello, from MyClass -> implements Runnable Interface method");
    }
}

public class ThreadCreation_Demo_2ndWay {
    public static void main(String[] args) {
        Thread objThreadClass = new Thread(new MyClass());
        objThreadClass.start();
        //objThreadClass.sleep(1000); //this is checked exceptions-[InterruptedException]
        try {
            objThreadClass.sleep(1000); //this error is handled by try catch block
        } catch (Exception e) {
            System.out.println("InterruptedException Handled by try and catch block!");
        }
    }
}
