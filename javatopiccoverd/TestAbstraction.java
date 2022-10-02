
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing Rectangle...");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing Circle");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Shape obj =new Circle();
        Shape obj2 = new Rectangle();
        obj.draw();
        obj2.draw();
    }
   
}
