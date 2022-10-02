
package abstraction;


public class Circle extends Shape{

    public Circle(double r) {
        super(r, r);
    }

    @Override
    void calculateArea() {
        double result= 3.1416 * dim1 * dim2;
        System.out.println("Circle Area : "+ result); 
    }
    
    
    
}
