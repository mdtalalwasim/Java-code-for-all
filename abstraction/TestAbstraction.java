
package abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Shape shape;
        
        shape = new Rectangle(2, 3);
        shape.calculateArea();
        
        shape = new Triangle(2, 3);
        shape.calculateArea();
        
        shape = new Circle(2);
        shape.calculateArea();
        
        
    }
}
