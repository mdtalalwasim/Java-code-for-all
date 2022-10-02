
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

/*
There are two ways to create a thread.

1. Extend the Thread class
Inherit from the Thread class, override its run() method, 
and write the functionality of the thread in the run() method.
Then you create a new object of your class 
and call it's start method to run the thread.
*/
class MyClass extends Thread{
    public void run(){
        System.out.println("Hello, from Thread run() method");
    }
}

public class Thread_Demo {
    public static void main(String[] args) {
        MyClass objOfMyClass = new MyClass();
        objOfMyClass.start();
    }
}
